package kr.co.ch06;

import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Inject
	private JdbcTemplate jdbc;

	public void insertUser() {
		Object[] values = {"S101", "홍길동", "010-1123-1234", 30};		
		jdbc.update("INSERT INTO `USER2` VALUES (?,?,?,?)", values);
	}
	
	public void updateUser() {
		
		String sql = "UPDATE `USER2` SET `name`=? "
				   + "WHERE `uid`=?";
		
		Object[] values = {"이순신", "P101"};
		
		jdbc.update(sql, values);
	}
	
	public void deleteUser() {
		jdbc.update("DELETE FROM `USER2` WHERE `age`=?", 33);
	}
	
	public UserVO selectUser(String uid) {
		
		String sql = "SELECT * FROM `USER2` WHERE `uid`=?";
		UserVO vo = jdbc.queryForObject(sql, new UserRowMapper(), uid);
		
		return vo;
	}
	
	public List<UserVO> selectUsers() {
		String sql = "SELECT * FROM `USER2`";
		
		List<UserVO> users = jdbc.query(sql, new UserRowMapper());
		
		return users;
	}
	
	
	
	
	
}