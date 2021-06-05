package com.tuling.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 12/29/20 4:57 PM
 **/
@Component
public class OrderLister implements ApplicationListener<OrderEvent> {
	@Override
	public void onApplicationEvent(OrderEvent event) {
		System.out.println("接收到事件:"+event);
	}
}
