package com.sevensevengsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OfficialsPageController {
	
	@GetMapping("/send-result")
	public String sendResult() {
		return "forAuth/send-result";
	}
}
