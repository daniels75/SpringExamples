package org.daniels.sample.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/rest")
public class SampleController {

	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getSampleName(@PathVariable String name, ModelMap model) {

		model.addAttribute("anyname", name);
		return "list";

	}
	
}