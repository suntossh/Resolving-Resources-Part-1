package com.suntossh.spring;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Scope(value="prototype")
@Component()
public class MyResourceReader {
	
	@Autowired
	//@Value("http://timesofindia.indiatimes.com/")
	//@Value("classpath:Test.txt")
	@Value("file:C:\\workspace_springdemo\\spring-bean-demo\\src\\main\\resources\\application-config.xml")
	private Resource resource;
	
	public void print(){
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
			for(String line= bufferedReader.readLine(); line != null; line = bufferedReader.readLine()){
				System.out.println(line);
			}
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
