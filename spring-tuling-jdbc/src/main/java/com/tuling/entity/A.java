package com.tuling.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 12/29/20 10:48 AM
 **/
@Component
public class A {

	@Autowired
	@Lazy
	private B b;



	public A() {
		System.out.println("a 加载了");
	}


	public void say() {
		System.out.println("a say");
	}

	public void initB() {
		System.out.println(b);
	}
}
