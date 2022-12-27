package com.sevensevengsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerPageController {
	
	@GetMapping("/register-team")
	public String registerTeam() {
		return "forAuth/register-team";
	}

	@GetMapping("/edit-team-info")
	public String editTeamInfo() {
		return "forAuth/edit-team-info";
	}
	
	@GetMapping("/team-record")
	public String teamRecord() {
		return "forAuth/team-record";
	}
}
