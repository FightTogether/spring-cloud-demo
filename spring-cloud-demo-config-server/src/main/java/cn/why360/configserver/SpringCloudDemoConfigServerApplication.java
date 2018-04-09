package cn.why360.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudDemoConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoConfigServerApplication.class, args);
	}
}
