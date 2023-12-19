package com.androjava.TechSpring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {

	@Bean("DriverMng")
	public DataSource getDataSource() {
		DriverManagerDataSource diverManager = new DriverManagerDataSource();
		diverManager.setDriverClassName("com.mysql.jdbc.Driver");
		diverManager.setUrl("jdbc:mysql:// server-name :3306/stechdb ");
		diverManager.setUsername("root");
		diverManager.setPassword("Babu12@212121");
		return diverManager;
	}
}
 