package org.dkf.jolt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ServingWebContentApplication extends SpringBootServletInitializer {
    private static Logger LOG = LoggerFactory.getLogger(ServingWebContentApplication.class);

    public static void main(String[] args) {
        LOG.info("ServingWebContentApplication started");
        SpringApplication.run(ServingWebContentApplication.class, args);
    }
}
