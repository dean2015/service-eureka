package cn.devcenter.framework.eureka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaServer {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = SpringApplication.run(EurekaServer.class);
        log.info("======= " + applicationContext.getId() + " Started =======");
    }
}
