package kh.com.a.controller;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kh.com.a.arrow.DownloadView;
import kh.com.a.arrow.FUpUtil;
import kh.com.a.model.PdsDto;
import kh.com.a.service.PdsService;

@Controller
public class PdsController {
	
	private static final Logger logger = LoggerFactory.getLogger(PdsController.class);

	@Autowired
	PdsService pdsService;
	
	@RequestMapping(value="pdslist.do", method={RequestMethod.GET, RequestMethod.POST})
	public String pdslist(Model model) {
	
		logger.info("PdsController pdslist " + new Date());
		
		List<PdsDto> pdslist = pdsService.getPdsList();
		
		model.addAttribute("doc_title", "자료실목록");
		model.addAttribute("pdslist", pdslist);
		
		return "pdslist.tiles";
	}
	
	@RequestMapping(value="pdswrite.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String pdswrite(HttpServletRequest req, Model model) {
		
		logger.info("PdsController pdsWrite"+ new Date());
		
		return "pdswrite.tiles";
	}
	
	@RequestMapping(value="pdsupload.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String pdsupload(PdsDto dto, HttpServletRequest req, 
							@RequestParam(value="fileload", required=false) MultipartFile fileload, Model model) {

		//upload -> multipartResolver 추가
		model.addAttribute("doc_title", "pds 업로드");
		logger.info("PdsController pdsUpload"+ new Date());
		
		dto.setFilename(fileload.getOriginalFilename());
		
		//파일 경로(서버)
		String fupload = req.getServletContext().getRealPath("/upload");
		logger.info("fupload:"+fupload);
		
		//파일경로(폴더)
		//String fupload = "d:\\upload";
		
		String f = dto.getFilename();
		
		String newFile= FUpUtil.getNewFile(f);
		
		logger.info(fupload + "/" + newFile);
		dto.setFilename(newFile);
		
		try {
			File file = new File(fupload + "/" + newFile);
			FileUtils.writeByteArrayToFile(file, fileload.getBytes());
			
			// db insert 부분
			pdsService.uploadPds(dto);
			
			logger.info("PdsController pdsupload success!!!");
			
		}catch (IOException e) {
			logger.info("PdsController pdsupload fail!!!");
		}
		
		
		return "redirect:/pdslist.do";
	}
	
	@RequestMapping(value="fileDownload.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String download(int seq, String filename, HttpServletRequest req, Model model) {
		
		logger.info("PdsController download"+ new Date());
		
		String fupload = req.getServletContext().getRealPath("/upload");
		//String fupload = "d:\\tmp";
		
		File downloadFile = new File(fupload+"/"+filename);
		model.addAttribute("downloadFile", downloadFile);
		model.addAttribute("seq", seq);
		
		return "downloadView";
	}
	
	@RequestMapping(value="pdsdetail.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String pdsdetail(int seq, Model model) {
		
		logger.info("PdsController pdsdetail"+ new Date());
		
		PdsDto pds = pdsService.getpds(seq);

		model.addAttribute("pds", pds);
		
		return "pdsdetail.tiles";
	}
	
	@RequestMapping(value="pdsdel.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String pdsdel(int seq, Model model) {
		
		logger.info("PdsController pdsDel"+ new Date());
		
		pdsService.delPds(seq);
		
		return "redirect:/pdslist.do";
	}
}






