package com.sevensevengsi.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class PageController {
	
	@GetMapping("/teams")
	public String teams() {
		return "forAuth/teams";
	}
	
	@GetMapping("/registration")
	public String teams() {
		return "forAuth/teams";
	}
	
	@GetMapping("/teams")
	public String teams() {
		return "forAuth/teams";
	}
}
