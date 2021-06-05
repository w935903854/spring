package com.tuling.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 12/30/20 10:32 AM
 **/
//@Aspect
//@Component
public class AspectTest {

	@Pointcut(value = "execution(* com.tuling.aspect.*.*())")
	public void pointCut() {
	}



	@Before(value = "pointCut()")
	public void before(){
		System.out.println("前置通知增强");
	}


}
