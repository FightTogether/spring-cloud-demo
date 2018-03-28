package cn.why360.eurekaserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudDemoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoEurekaServerApplication.class, args);
	}
}
