package com.example.demo.test2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ballsb on 2018/2/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PropertiesTest {

    @Autowired
    private Properties properties;

    @Test
    public void getProperties(){
        Assert.assertEquals(properties.getName(), "有志青年");
        Assert.assertEquals(properties.getTitle(), "Spring4All");
    }

}