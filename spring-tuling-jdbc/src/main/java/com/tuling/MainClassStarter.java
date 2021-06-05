package com.tuling;


import com.tuling.aspect.AspectA;
import com.tuling.config.ImportConfig;
import com.tuling.config.MainConfig;
import com.tuling.config.TestConfig;
import com.tuling.dao.AccountInfoDao;
import com.tuling.dao.UserDao;
import com.tuling.entity.A;
import com.tuling.entity.Test;
import com.tuling.entity.User;
import com.tuling.entity.UserInfo;
import com.tuling.listener.OrderEvent;
import com.tuling.service.UserServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by xsls on 2019/8/18.
 */
public class MainClassStarter {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportConfig.class);
		UserInfo bean = context.getBean(UserInfo.class);


//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//
//		UserDao userDao = (UserDao) context.getBean("userDao");
////		System.out.println(userDao.findOne(1));
//		userDao.update(1,"修改八啦");
//		System.out.println(userDao.findOne(1));
//
//		accountInfoDao.saveAccountInfo("9988776644",500);*/
//
//		UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
//		//userService.updateBlance(1);
//		userService.findUserName(1);
//		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TestConfig.class);
//		annotationConfigApplicationContext.getBean("aspectA",AspectA.class).say();
//		annotationConfigApplicationContext.publishEvent(new OrderEvent("21","23"));
//		AspectA aspectA = annotationConfigApplicationContext.getBean("aspectA", AspectA.class);
//		aspectA.say();
//		A a = annotationConfigApplicationContext.getBean("a", A.class);
//		a.say();
//		a.initB();
//		System.out.println(a);

	}

}
