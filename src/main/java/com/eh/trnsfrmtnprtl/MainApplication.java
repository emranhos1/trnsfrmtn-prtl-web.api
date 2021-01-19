package com.eh.trnsfrmtnprtl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.eh.trnsfrmtnprtl.config.AppProperties;
import com.eh.trnsfrmtnprtl.util.PropertyUtil;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class MainApplication {

    private static final Logger LOG = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class, args);

        LOG.info("START UP MASSAGE :: {}", PropertyUtil.WELCOME);
        LOG.info("Check URL :: {}", PropertyUtil.URL);
    }
}
