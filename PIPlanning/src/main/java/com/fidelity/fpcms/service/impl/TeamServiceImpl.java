package com.fidelity.fpcms.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fidelity.fpcms.bean.Team;
import com.fidelity.fpcms.dao.TeamDAO;
import com.fidelity.fpcms.service.TeamService;

@Service("teamService")
public class TeamServiceImpl implements TeamService{
	
	private static final Logger logger = Logger.getLogger(TeamServiceImpl.class);
	
	@Autowired
	TeamDAO teamDAOImpl;

	@Override
	public Team getTeam(int teamId) {
		logger.info("Inside Get Team Method In TeamService, teamId :: "+ teamId);
		return teamDAOImpl.getTeam(teamId);
	}
}
