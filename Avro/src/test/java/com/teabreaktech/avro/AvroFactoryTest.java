package com.teabreaktech.avro;

import org.apache.log4j.BasicConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kishorekpendyala on 11/20/16.
 */
public class AvroFactoryTest {

    private static final Logger log = LoggerFactory.getLogger(AvroFactoryTest.class);

    @Before
    public void setUp(){
        BasicConfigurator.configure();
    }

    @Test
    public void getRiskSchema() throws Exception {
        log.info(AvroFactory.get().getSchema(Risk.class).toString());
    }

    @Test
    public void getWrapperSchema() throws Exception{
        log.info(AvroFactory.get().getSchema(Wrapper.class).toString());
    }

}