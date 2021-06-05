package com.tuling.aspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 12/30/20 10:34 AM
 **/
@Component
public class AspectA {
//
//	@Autowired
//	private AspectB aspectB;

	public AspectA() {
		System.out.println("切面 A 已经加载");
	}


	public void say(){
		System.out.println("a 的 say方法");
	}
	public void say1(){
		System.out.println("a 的 say1方法");
	}
}
