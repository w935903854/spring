package com.tuling.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 12/29/20 4:58 PM
 **/

public class OrderEvent extends ApplicationEvent {

	private String name;


	public OrderEvent(Object source, String name) {
		super(source);
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "OrderEvent{" +
				"name='" + name + '\'' +
				", source=" + source +
				'}';
	}
}
