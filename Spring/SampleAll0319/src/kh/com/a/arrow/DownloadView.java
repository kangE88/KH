package kh.com.a.arrow;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.view.AbstractView;

import kh.com.a.service.PdsService;

public class DownloadView extends AbstractView {

	@Autowired
	PdsService pdsService;
	
	public DownloadView() {
		System.out.println("DownloadView DownloadView()");
		setContentType("application/download; charset=utf-8"); 
	}
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest req, HttpServletResponse resp)
			throws Exception {
//		setContentType("application/download; charset=utf-8");
		File file = (File)model.get("downloadFile");
		resp.setContentType(this.getContentType());
		resp.setContentLength((int) file.length());
		
		String userAgent = req.getHeader("User-Agent");
		boolean ie = userAgent.indexOf("MSIE") > -1; // ie
		
		String filename = null;
		if(ie) {
			filename = URLEncoder.encode(file.getName(), "utf-8");
		}else {
			filename = new String(file.getName().getBytes("utf-8"), "iso-8859-1");
		}
		
		
		//브라우저상에 파일 다운로드 띄우기
		resp.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\";");
		resp.setHeader("Content-Transfer-Encoding", "binary");
        resp.setHeader("Content-Length", "" + file.length());
        resp.setHeader("Pragma", "no-cache;");
        resp.setHeader("Expires", "-1;");

        OutputStream out = resp.getOutputStream();
        FileInputStream fi = null;
        
        try {
        	fi = new FileInputStream(file);
        	FileCopyUtils.copy(fi, out);
        	
        	int seq = (int) model.get("seq");
        	//downloadcount 증가
        	pdsService.downCountInc(seq);
        	
        }catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fi != null) {
				fi.close();
			}
		}
        out.flush();
	}

}
