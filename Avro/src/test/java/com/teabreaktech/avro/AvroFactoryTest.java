package com.teabreaktech.avro;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kishorekpendyala on 11/20/16.
 */
public class AvroFactoryTest {

    private  static final Logger log = LoggerFactory.getLogger(AvroFactoryTest.class);

    @Test
    public void getSchema() throws Exception {

        System.out.println(""+AvroFactory.get().getSchema(User.class));
    }

}