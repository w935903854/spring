package com.tuling.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 12/29/20 10:49 AM
 **/
@Component
@Lazy
public class B {

	public B() {
		System.out.println("b 加载了");
	}
}
