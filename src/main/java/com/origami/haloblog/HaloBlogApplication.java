package com.origami.haloblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * @author 28455
 */
@SpringBootApplication
public class HaloBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaloBlogApplication.class, args);
    }

}
