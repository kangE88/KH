package kh.com.a.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kh.com.a.model.MemberDto;
import kh.com.a.model.PollBean;
import kh.com.a.model.PollDto;
import kh.com.a.model.Voter;
import kh.com.a.service.PollService;

@Controller
public class PollController {
	
	private static final Logger logger = LoggerFactory.getLogger(PollController.class);
	
	@Autowired
	private PollService pollService;
	
	@RequestMapping(value="polllist.do",method= {RequestMethod.GET,RequestMethod.POST})
	public String polllist(HttpServletRequest req, Model model) {
		
		logger.info("PollController polllist");
		
		model.addAttribute("doc_title", "투표목록");
		
		String id = ((MemberDto)req.getSession().getAttribute("login")).getId();
		
		model.addAttribute("plists", pollService.getPollAlllist(id));
		
		return "polllist.tiles";
	}	

	@RequestMapping(value="pollmake.do", method={RequestMethod.GET,RequestMethod.POST})
	public String pollmake(Model model) {
		
		logger.info("PollController pollmake");
		
		return "pollmake.tiles";
	}
	
	@RequestMapping(value="pollmakeAf.do", method={RequestMethod.GET,RequestMethod.POST})
	public String pollmakeAf(PollBean pbeen, Model model) {
		logger.info("PollController pollmakeAf");
		
		pollService.makePoll(pbeen);
				
		return "redirect:/polllist.do";
		//return "forword:/polllist.do";
	}
	
	@RequestMapping(value="polldetail.do", method={RequestMethod.GET,RequestMethod.POST})
	public String polldetail(PollDto poll, Model model) {
		logger.info("PollController polldetail");
		
		model.addAttribute("doc_title", "투표내용");
		
		model.addAttribute("poll", pollService.getPoll(poll));
		model.addAttribute("pollsublist", pollService.getPollSubList(poll));
		
		return "polldetail.tiles";
	}
	
	@RequestMapping(value="polling.do", method={RequestMethod.GET,RequestMethod.POST})
	public String polling(Voter voter, Model model) {
		logger.info("PollController polling");
		
		pollService.polling(voter);
		
		return "redirect:/polllist.do";
	}
	
	@RequestMapping(value="pollresult.do", method={RequestMethod.GET,RequestMethod.POST})
	public String pollresult(PollDto poll, Model model) {
		logger.info("PollController pollresult");
		
		model.addAttribute("doc_title","투표결과");
		model.addAttribute("poll", pollService.getPoll(poll));
		model.addAttribute("pollsublist", pollService.getPollSubList(poll));
		
		return "pollresult.tiles";
	}
	
}