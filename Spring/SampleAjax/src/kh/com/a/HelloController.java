package kh.com.a;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(value="login.do", method=RequestMethod.GET)
	public String login(Model model) {
	      
		logger.info("-->HelloCOntroller login() Call");
		MyClass cls = new MyClass();
		cls.setNumber(1001);
		cls.setName("홍길동");
		
		model.addAttribute("hgd", cls);
	   
		return "helloSpring";
	}
	
	//2
	@RequestMapping(value="inputData.do", method=RequestMethod.GET)
	public String inputData(MyClass mycls, Model model) {
		
		logger.info(mycls.toString());
		
		model.addAttribute("hgd", mycls);
		
		return "helloSpring";
	}
	
	//3
	@ResponseBody  //ajax를 사용할때 필수!!
	@RequestMapping(value="idcheck.do",
					produces="application/String; charset=utf-8",
					method=RequestMethod.POST)
	public String checkid(String id) {
		
		logger.info("id==>"+id);
		String str = "OK";
		
		return str;
	}
	
	//4
	@ResponseBody
	@RequestMapping(value="account.do", method=RequestMethod.GET)
	public Map<String, Object> account(DTO dto){
		
		logger.info(dto.toString());
		
		//return value
		Map<String, Object> rmap = new HashMap<String, Object>();
		
		rmap.put("message", "메세지 보냄");
		
		return rmap;
		
	}
	
	//5
	@ResponseBody
	@RequestMapping(value="updateUser.do", method=RequestMethod.POST)
	public Map<String, Object> updateUser(@RequestBody Map<String, Object> map){
		logger.info((String)map.get("name"));
		logger.info((String)map.get("tel"));
		logger.info((String)map.get("email"));
		logger.info((String)map.get("birth"));
		
		Map<String, Object> rmap = new HashMap<String, Object>();
		
		rmap.put("msg", "송신메시지");
		
		return rmap;
	}
	
}
