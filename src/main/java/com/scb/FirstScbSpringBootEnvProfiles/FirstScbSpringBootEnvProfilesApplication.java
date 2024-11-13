package com.scb.FirstScbSpringBootEnvProfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scb.FirstScbSpringBootEnvProfiles.entitybean.MyDataResource;

@SpringBootApplication
public class FirstScbSpringBootEnvProfilesApplication implements CommandLineRunner {
	@Autowired
	MyDataResource myDataResource;
	public static void main(String[] args) {
		SpringApplication.run(FirstScbSpringBootEnvProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(myDataResource.getUserName());
		System.out.println(myDataResource.getPassword());

	}

}
