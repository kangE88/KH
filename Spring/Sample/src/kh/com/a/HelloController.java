package kh.com.a;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

/*	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView v = new ModelAndView();
		v.setViewName("/helloSpring");
		
		return v;
	}*/
	
   @RequestMapping(value="login.do", method=RequestMethod.GET)
   public String login(Model medel) {
      System.out.println("login.do excuted!");      
      return "helloSpring";
   }
}
