package com.fidelity.fpcms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fidelity.fpcms.bean.Team;
import com.fidelity.fpcms.controller.TeamController;
import com.fidelity.fpcms.dao.TeamDAO;

@Repository("teamDAO")
public class TeamDAOImpl implements TeamDAO {
	
	private static final Logger logger = Logger.getLogger(TeamDAOImpl.class);
	
	private JdbcTemplate jdbcTemplate;
	
	private DataSource dataSource;
	
	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public Team getTeam(int teamId) {
		logger.info("Entering Get Team Details TeamDAO for teamId :: " + teamId);
		Team team = this.jdbcTemplate.queryForObject(
		        "select * from Team where TeamId = ?",
		        new Object[]{teamId},
		        new RowMapper<Team>() {
		            public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
		                Team team = new Team();
		                team.setTeamId(teamId);
		                team.setTeamName(rs.getString("TeamName"));
		                team.setGroupId(rs.getInt("GroupId"));
		                return team;
		            }
		        });
		return team;

	}

}
