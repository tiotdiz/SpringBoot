package com.qps.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/home")
@Controller
public class HomeController {
	@RequestMapping(value = "/hw", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String hwGet(Integer sex, String name,Double prov) {
		System.out.println(sex);
		System.out.println(name);
		System.out.println(prov);
		return "{\"id\":1, \"name\":\"get\"}";
	}
	
	@RequestMapping(value = "/hw", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String hwPost() {
		return "{\"id\":1, \"name\":\"post\"}";
	}
}
