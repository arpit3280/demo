package com.fidelity.fpcms.bean;

import java.util.List;

public class Team {
	
	private String teamName;
	private int teamId;	
	private int groupId;
	private List<SubTeam> subTeams;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public List<SubTeam> getSubTeams() {
		return subTeams;
	}

	public void setSubTeams(List<SubTeam> subTeams) {
		this.subTeams = subTeams;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

}
