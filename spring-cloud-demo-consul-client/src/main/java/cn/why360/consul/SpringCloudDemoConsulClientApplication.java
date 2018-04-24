package cn.why360.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudDemoConsulClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudDemoConsulClientApplication.class).web(true).run(args);
    }
}
