package com.scb.FirstScbSpringBootEnvProfiles.configfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.scb.FirstScbSpringBootEnvProfiles.entitybean.MyDataResource;

@Configuration
public class MyConfigurationFile {
@Bean
public MyDataResource myDataResource(@Value("${mydataresource.username}") String username,
		@Value("${mydataresource.password}") String password) {

	MyDataResource myDataResource = new MyDataResource();
	myDataResource.setUserName(username);
	myDataResource.setPassword(password);
	return myDataResource;
	
}
}
