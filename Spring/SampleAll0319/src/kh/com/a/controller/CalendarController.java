package kh.com.a.controller;

import java.util.Date;
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
import org.springframework.web.bind.annotation.ResponseBody;

import kh.com.a.arrow.CalendarUtil;
import kh.com.a.arrow.myCal;
import kh.com.a.model.CalendarDto;
import kh.com.a.model.MemberDto;
import kh.com.a.service.CalendarService;

@Controller
public class CalendarController {
	private static final Logger logger = LoggerFactory.getLogger(KhBbsController.class);
	
	@Autowired
	CalendarService calenderService;
	
	@RequestMapping(value="calendar.do", method={RequestMethod.GET, RequestMethod.POST})
	public String calendar(HttpServletRequest req, Model model, myCal jcal)throws Exception {
		logger.info("CalendarController getCalenderList");
		
		jcal.calculate(); //현재 시간 취득
		
		int year = jcal.getYear();
		int month = jcal.getMonth();
		
		String id = ((MemberDto)req.getSession().getAttribute("login")).getId();
		String yyyyMM = CalendarUtil.yyyymm(year, month);
			
		CalendarDto fcal = new CalendarDto();
		fcal.setId(id);
		fcal.setRdate(yyyyMM);
		
		List<CalendarDto> flist = calenderService.getCalendarList(fcal);
		
		model.addAttribute("flist",flist);
		model.addAttribute("jcal",jcal);
		
		return "calendar.tiles";
	}
	
	@RequestMapping(value="calwrite.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String calwrite(HttpServletRequest req, Model model, myCal jcal) throws Exception{
		
		logger.info("CalendarController calwrite");
		
		model.addAttribute("doc_title","일정 등록");
		model.addAttribute("jcal",jcal);
				
		return "calwrite.tiles";
	}
	
	@RequestMapping(value="calwriteAf.do", method= {RequestMethod.GET,RequestMethod.POST})
	public String calwriteAf(HttpServletRequest req, CalendarDto cal, int year, int month, int day) throws Exception {
		
		logger.info("CalendarController calwriteAf! "+ new Date());

		String rdate = CalendarUtil.yyyymmdd(year, month, day);
		
		cal.setRdate(rdate);
		
		System.out.println("cal.getRdate()==>"+cal.getRdate());
		
		if(cal.getContent().equals("") || cal.getTitle().equals("")){
			return "calwrite";
		}
		
		calenderService.addCalendar(cal);
		
		return "redirect:/calendar.do";
	}
	
	@RequestMapping(value="caldetail.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String caldetail(int seq, Model model) throws Exception{
		
		logger.info("CalendarController caldetail! "+ new Date());
		
		model.addAttribute("doc_title","일정 상세보기");
		
		CalendarDto cal = calenderService.getCalendar(seq);
		model.addAttribute("cal", cal);
		
		return "caldetail.tiles";
	}
	
	@RequestMapping(value="calupdate.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String calupdate(int seq, String title, String content, Model model) throws Exception{
		
		logger.info("CalendarController calupdate! "+ new Date());
		
		CalendarDto cal = calenderService.getCalendar(seq);
		
		cal.setTitle(title);
		cal.setContent(content);
		calenderService.UpdateCalendar(cal);
				
		model.addAttribute("cal", cal);
		
		return "redirect:calendar.do";
	}
	
	
}
