/**
 * Created by wangk on 2017/3/11.
 */
package com.lkl.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liaokailin on 16/4/28.
 */
@Configuration
@EnableAutoConfiguration
@RestController
@EnableConfigServer
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
