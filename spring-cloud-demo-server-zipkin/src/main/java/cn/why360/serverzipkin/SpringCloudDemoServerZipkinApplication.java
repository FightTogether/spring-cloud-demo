package cn.why360.serverzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringCloudDemoServerZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoServerZipkinApplication.class, args);
	}
}
