package com.tuling.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 12/16/20 2:21 PM
 **/
//@Component
public class Test {

	private AccountInfo accountInfo;


	@Autowired
	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	public void say(){
		System.out.println(accountInfo);}


}
