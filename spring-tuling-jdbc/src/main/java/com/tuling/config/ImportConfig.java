package com.tuling.config;

import com.tuling.dao.UserDao;
import com.tuling.entity.A;
import com.tuling.entity.AccountInfo;
import com.tuling.entity.User;
import com.tuling.entity.UserInfo;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author dunxinlong
 * @slogan 愿半生编码 如一生好友
 * @email dunxl1010@163.com
 * @since 4/5/21 8:54 PM
 **/
@Import({MyDeferredImportSelect.class, MyImportSelect.class})
@Configuration
@ComponentScan(basePackages = {"com.tuling.entity"})
public class ImportConfig {

}
