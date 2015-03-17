package com.github.yihtserns.test.spring.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author yihtserns
 */
@SpringBootApplication
public class Application {

    @Value("${name}")
    private String name;

    @Bean
    public String nameBean() {
        return name;
    }

    @Bean
    public Dependency dependency() {
        return new Dependency();
    }
}
