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
public class AspectB {

	@Autowired
	private AspectA aspectA;

	public AspectB() {
		System.out.println("切面 B 已经加载");
	}

	public void say(){
		System.out.println("b 的 say 方法");
	}
}
