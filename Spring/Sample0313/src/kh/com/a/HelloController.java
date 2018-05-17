package kh.com.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.cj.mysqla.authentication.MysqlClearPasswordPlugin;

@Controller
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(value="login.do", method=RequestMethod.GET)
	public String login(Model medel) {
	      
		logger.info("-->login.do Start");
			   
		return "helloSpring";
	}
}
