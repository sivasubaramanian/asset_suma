package com.asset.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
// import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
// import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class})
// @EnableMongoRepositories(basePackages = "com.asset.management.repository")
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

}
