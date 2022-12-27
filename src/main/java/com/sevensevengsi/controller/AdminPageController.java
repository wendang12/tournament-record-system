package com.sevensevengsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminPageController {
	
	//Approve Teams
	@GetMapping("teams/approval")
	public String approveTeams() {
		return "forAuth/approve-teams";
	}
	
	//Edit Team info
	@GetMapping("teams/info")
	public String teamInfo() {
		return "forAuth/team-info";
	}
	
	//View All Teams
	@GetMapping("teams/all")
	public String teams() {
		return "forAuth/teams";
	}
	
	//View All Tournament Records
	@GetMapping("/tournament-records/all")
	public String tournamentRecords() {
		return "forAuth/tournament-records";
	}
	
	//View All Managers
	@GetMapping("/managers/all")
	public String teamManagers() {
		return "forAuth/team-managers";
	}
	
	//View All Officials
	@GetMapping("/officials/all")
	public String officials() {
		return "forAuth/officials";
	}
	
	//View All Games
	@GetMapping("/games/all")
	public String games() {
		return "forAuth/games";
	}
	
}
