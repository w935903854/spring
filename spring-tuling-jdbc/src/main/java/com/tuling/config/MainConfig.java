package com.tuling.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * Created by xsls on 2019/6/17.
 */
@EnableTransactionManagement
@EnableAspectJAutoProxy(exposeProxy = true)
@ComponentScan(basePackages = {"com.tuling"})
public class MainConfig {


	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("Dun112233");
		dataSource.setUrl("jdbc:mysql://106.54.25.238:3306/test?characterEncoding=UTF-8");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}

	@Bean
	public AbstractRoutingDataSource abstractRoutingDataSource() {
		AbstractRoutingDataSource dataSource = new AbstractRoutingDataSource() {
			@Override
			protected Object determineCurrentLookupKey() {
				return "a";
			}
		};
		dataSource.setTargetDataSources(new HashMap<Object, Object>() {{
			put("a", dataSource());
		}});
		dataSource.setDefaultTargetDataSource(dataSource());
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(AbstractRoutingDataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public PlatformTransactionManager transactionManager(AbstractRoutingDataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

}
