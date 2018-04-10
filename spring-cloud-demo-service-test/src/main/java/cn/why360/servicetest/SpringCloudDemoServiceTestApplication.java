package cn.why360.servicetest;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudDemoServiceTestApplication {
	private static final Logger LOG = Logger.getLogger(SpringCloudDemoServiceTestApplication.class.getName());
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoServiceTestApplication.class, args);
	}
}
