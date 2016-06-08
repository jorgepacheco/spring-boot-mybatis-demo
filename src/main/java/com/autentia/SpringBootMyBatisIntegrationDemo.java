package com.autentia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringBootMyBatisIntegrationDemo {

	@Bean
	@Autowired
	DataSourceTransactionManager getDataSourceTransactionManager(DataSource datasource){
		return new DataSourceTransactionManager(datasource);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyBatisIntegrationDemo.class, args);
	}
}
