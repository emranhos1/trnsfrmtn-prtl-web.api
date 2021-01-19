package com.example.springsocial.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eh.trnsfrmtnprtl.util.PropertyUtil;
/**
 * @author   Md. Emran Hossain <emranhos1@gmail.com>
 * @version  1.0.00 EH
 * @since    1.0.00 EH
 */
public class PropertyUtilTests {

    private static Logger LOG = LoggerFactory.getLogger(PropertyUtil.class);

    @Before
    public void setUp() throws Exception {
        LOG.debug("START UP MASSAGE :: {}", PropertyUtil.TEST_START);
    }

    @After
    public void tearDown() throws Exception {
        LOG.debug("Check URL :: {}", PropertyUtil.TEST_END);
    }

    @Test
    public void testRecord() {
        int num=1;
        assertEquals(1, num);
    }
}
