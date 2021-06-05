package com.tuling.dao;

import com.tuling.entity.User;
import com.tuling.entity.UserInfo;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xsls on 2019/8/18.
 */
@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public User findOne(Integer userId) {
		String sql = "select * from user where id=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{userId}, ((rs, rowNum) -> {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setAge(rs.getInt("age"));
			user.setName(rs.getString("name"));
			user.setRemark(rs.getString("remark"));
			return user;
		}));
	}

	@Transactional
	public void update(Integer userId, String name) {
		jdbcTemplate.update("update user set name = ?  where id = ?", name, userId);
		((UserDao) AopContext.currentProxy()).update1(userId + 1);
	}


	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void update1(Integer userId) {
		jdbcTemplate.update("update user set name = ?  where id = ?", "requires_new", userId);
		System.out.println(findOne(userId));
	}


}
