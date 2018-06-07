package com.npsg.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = { "com.npsg.model.entities" })
public class NpsgAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpsgAdminApplication.class, args);

	}
}
