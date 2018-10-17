package org.activiti.cloud.query.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.stagemonitor.core.Stagemonitor;

@SpringBootApplication
public class GraphQLQueryApplication {

	public static void main(String[] args) {
        Stagemonitor.init();
		
		SpringApplication.run(GraphQLQueryApplication.class, args);
	}
}