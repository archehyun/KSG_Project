package com.ksg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.ksg.base.area.service.AreaService;
import com.ksg.base.area.service.impl.AreaServiceImpl;

@SpringBootConfiguration
@ComponentScan
public class App {
	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(App.class); 
		app.setWebEnvironment(false);
		app.run(args);
		
	}
	
	@Component
	class Login implements CommandLineRunner
	{
		@Autowired
		AreaService areaService;

		@Override
		public void run(String... arg0) throws Exception {
			areaService.insert(null);
			
		}
		
	}

}

