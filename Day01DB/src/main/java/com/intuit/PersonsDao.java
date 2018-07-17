package com.intuit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<String> getAllNames() {
		List<String> names = jdbcTemplate.query("select name from persons", 
				(rs,rowIndex) -> rs.getString("name"));

		/*
		List<String> names = jdbcTemplate.query("select name from persons", 
					new RowMapper<String>() {
						public String mapRow(ResultSet rs, int rowIndex) throws SQLException {
							return rs.getString("name");
						}
					});
		*/			
		return names;
	}
	public void delete(int id) {
		jdbcTemplate.update("delete from persons where id=?",id);
	}
	
	public void insert(String name,int age) {
		jdbcTemplate.update("inser into persons(name,age) values(?,?)",name,age);
	}
}









