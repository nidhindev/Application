package com.tcs.effort;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tcs.effort.domain.EffortTracker;





@Controller
public class EffortController {
	
	@Autowired
	private EffortTracker effort;

	@RequestMapping("/")
	public String hello() {
		effort.setDescription("fs");
		return "welcome";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String hi(@RequestParam("name") String name,@RequestParam("desc") String desc,@RequestParam("hour") String hour, Model model) {
		
		effort.setName(name);
		effort.setDescription(desc);
		effort.setHours(Integer.parseInt(hour));
		model.addAttribute("message", effort.getName());
		return "result";
	}
	
}
