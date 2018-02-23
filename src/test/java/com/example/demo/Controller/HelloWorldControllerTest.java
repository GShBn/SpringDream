package com.example.demo.Controller; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;

/** 
* HelloWorldController Tester. 
* 
* @author <Authors name> 
* @since <pre>二月 23, 2018</pre> 
* @version 1.0 
*/ 
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest { 

    private MockMvc mockMvc;
    @InjectMocks
    private HelloWorldController test;

    @Before
    public void setup() throws Exception { 

        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(test).build();
    } 

    @After
    public void after() throws Exception { 
    } 

    /**
    * 
    * Method: helloWorld() 
    * 
    */ 
    @Test
    public void testSayHello() throws Exception {
        assertEquals("Hello World Dream Spring Boot!",new HelloWorldController().sayHello());

        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andDo(MockMvcResultHandlers.print()).andReturn();
    }
}
