package kh.com.a.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kh.com.a.model.BbsDto;
import kh.com.a.model.MemberDto;
import kh.com.a.service.KhBbsService;
import kh.com.a.service.KhMemberService;

@Controller
public class KhBbsController {

	private static final Logger Logger = LoggerFactory.getLogger(KhMemberController.class);
	
	@Autowired
	KhBbsService khBbsService;
	KhMemberService khMemService;
	
	@RequestMapping(value="bbslist.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String bbslist(HttpServletRequest req, Model model) throws Exception {
		Logger.info("khBbsController bbslist");
		
		List<BbsDto> bbslist = khBbsService.getBbsList();
		model.addAttribute("bbslist", bbslist);
		
		return "bbslist";
	}
	
	@RequestMapping(value="bbsDetail.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String bbsDetail(int seq, Model model)throws Exception {
		Logger.info("khBbsController bbsDetail");
		
		//readCount ++
		khBbsService.readCount(seq);
		BbsDto bbs = khBbsService.getBBS(seq);
		
		model.addAttribute("getBBS", bbs);
		
		return "bbsDetail"; 
	}
	
	@RequestMapping(value="bbswrite.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String bbswrite(HttpServletRequest req, Model model) throws Exception{
		Logger.info("khBbsController bbsWrite");
		
		//login session 값 가져오기
		req.getSession().getAttribute("login");
		
		return "bbswrite";
	}
	
	@RequestMapping(value="bbswriteAf.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String bbswriteAf(HttpServletRequest req, Model model) throws Exception{
		Logger.info("khBbsController bbsWrite");
		
		//login session 값 가져오기
		req.getSession().getAttribute("login");
		
		return "bbswriteAf";
	}
	
	@RequestMapping(value="bbsDelete.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String bbsDetail() throws Exception{
		Logger.info("khBbsController bbsDelete");
		
		
		return "bbsDelete";
	}
	
	@RequestMapping(value="logout.do", method= {RequestMethod.GET,RequestMethod.POST})
	public String logout() throws Exception {
		Logger.info("KHMemberController logOut");
		
		return "logout";
	}
	
}
