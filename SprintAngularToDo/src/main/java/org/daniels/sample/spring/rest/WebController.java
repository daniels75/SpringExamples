package org.daniels.sample.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String redirect() {
		return "index";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String redirectDefault() {
		return "redirect:/static/index.html";
	}
	
}