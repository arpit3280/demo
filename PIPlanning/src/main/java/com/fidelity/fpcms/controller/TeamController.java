package com.fidelity.fpcms.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fidelity.fpcms.bean.Team;
import com.fidelity.fpcms.service.TeamService;

@Controller
@RequestMapping(value="/Team")
public class TeamController {	
	
	private static final Logger logger = Logger.getLogger(TeamController.class);
	
	@Autowired
	TeamService teamServiceImpl;
	
	@RequestMapping(value = "/getTeam", method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	public Team getTeam(@RequestParam int teamId){
		logger.info("Inside Get Team Method In Controller, teamId :: "+ teamId);
		return teamServiceImpl.getTeam(teamId);		
	}
	
	@RequestMapping(value = "/addTeam", method = RequestMethod.POST)
	@ResponseBody
	public String addTeam(@RequestBody Team team){
		logger.info("Inside add Team Method");
		return "success";		
	}
	
	@RequestMapping(value = "/deleteTeam", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteTeam(@RequestParam int teamId){
		logger.info("Inside delete Team Method");
		return "success";		
	}
	
	@RequestMapping(value = "/updateTeam", method = RequestMethod.PUT)
	@ResponseBody
	public String updateTeam(@RequestBody Team team){
		logger.info("Inside update Team Method");
		return "success";		
	}

}
