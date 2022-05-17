package ai.jobiak.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String test(@RequestParam(name="Ioc",defaultValue="Boston",required=false)String loc,Model model){
		model.addAttribute("com","Jobiak");
		model.addAttribute("ho",loc);
		model.addAttribute("email","hrteam@jobiak.com");
		model.addAttribute("location","Vizag");
		return "sucess";
	}
	}
