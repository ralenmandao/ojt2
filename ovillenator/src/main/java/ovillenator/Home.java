package ovillenator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ovillenator.repo.PersonRepository;

@Controller
public class Home {
	@Autowired
	private String aweaeaw;
	@Autowired
	private PersonRepository personRepo;
	
	@RequestMapping("/aaa")
	public String lol(){
		return "home";
	}
}
