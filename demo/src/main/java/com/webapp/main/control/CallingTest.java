package com.webapp.main.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CallingTest {

	@RequestMapping("/test")
	@ResponseBody
	public String CallThis() {
		return "This is running now!";
		
	}
	
}
