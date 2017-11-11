package com.fidelity.fpcms.bean;

public class SubTeam {
	
	private String subTeamName;
	private int subTeamId;
	private int teamId;
	private int trackId;
	
	public String getSubTeamName() {
		return subTeamName;
	}
	public void setSubTeamName(String subTeamName) {
		this.subTeamName = subTeamName;
	}
	public int getSubTeamId() {
		return subTeamId;
	}
	public void setSubTeamId(int subTeamId) {
		this.subTeamId = subTeamId;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public int getTrackId() {
		return trackId;
	}
	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}
}
