package com.tuling.entity;

import com.tuling.dao.UserDao;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by xsls on 2019/8/18.
 */
@Component
public class UserInfo {

	private Integer id;

	private String userName;

	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}





	@Override
	public String toString() {
		return "UserInfo{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				'}';
	}


}
