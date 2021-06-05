package com.tuling.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 12/30/20 4:35 PM
 **/
@Component
public class OrderAnnotationLister {


	@EventListener
	public void orderListener(OrderEvent orderEvent){
		System.out.println("注解版监听到事件:"+orderEvent);
	}
}
