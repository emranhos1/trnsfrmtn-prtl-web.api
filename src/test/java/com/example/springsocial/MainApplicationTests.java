package com.example.springsocial;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import com.eh.trnsfrmtnprtl.MainApplication;
import com.eh.trnsfrmtnprtl.util.PropertyUtil;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
@RunWith(SpringRunner.class)
public class MainApplicationTests {

    private static final Logger LOG = LoggerFactory.getLogger(MainApplication.class);

    @Test
    public void contextLoads() {
        LOG.debug("START UP MASSAGE :: {}", PropertyUtil.TEST_START);
        LOG.debug("Check URL :: {}", PropertyUtil.TEST_END);
    }
}
