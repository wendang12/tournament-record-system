package com.sevensevengsi.controller;

import com.sevensevengsi.repository.GameRepo;
import com.sevensevengsi.repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminPageController {

	@Autowired
	private TeamRepo teamRepo;
	
	@Autowired
	private GameRepo gameRepo;
	
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
	public ModelAndView getAllTeams() {
		ModelAndView model = new ModelAndView("forAuth/teams");
		model.addObject("teams", teamRepo.findAll());
		return model;
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
	@GetMapping("games/all")
	public ModelAndView games() {
		ModelAndView model = new ModelAndView("forAuth/games");
		model.addObject("games", gameRepo.findAll());
		return model;
	}
	
}
