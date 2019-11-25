package guru.ritesh.medicines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MedicinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicinesApplication.class, args);
	}

}
