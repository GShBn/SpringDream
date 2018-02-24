package com.example.demo.test5;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ballsb on 2018/2/24.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private ManRepository manRepository;

    @Test
    public void test() throws Exception{

        // 创建10条记录
        manRepository.save(new Man("AAA", 10));
        manRepository.save(new Man("BBB", 20));
        manRepository.save(new Man("CCC", 30));
        manRepository.save(new Man("DDD", 40));
        manRepository.save(new Man("EEE", 50));
        manRepository.save(new Man("FFF", 60));
        manRepository.save(new Man("GGG", 70));
        manRepository.save(new Man("HHH", 80));
        manRepository.save(new Man("III", 90));
        manRepository.save(new Man("JJJ", 100));


        Assert.assertEquals(10, manRepository.findAll().size());

        Assert.assertEquals(100, manRepository.findByName("JJJ").getAge().longValue());


    }

}
