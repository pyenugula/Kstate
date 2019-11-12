package com.acroot.oss.kstate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootDemoApplication {
	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}
}
