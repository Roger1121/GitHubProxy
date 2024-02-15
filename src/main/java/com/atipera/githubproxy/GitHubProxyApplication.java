package com.atipera.githubproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GitHubProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitHubProxyApplication.class, args);
    }

}
