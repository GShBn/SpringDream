package com.example.demo.test3; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/** 
* UserController Tester. 
* 
* @author <Authors name> 
* @since <pre>二月 24, 2018</pre> 
* @version 1.0 
*/ 
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest { 

    private MockMvc mockMvc;
    @InjectMocks
    private UserController test;

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
    * Method: getUserList() 
    * 
    */ 
    @Test
    public void testGetUserList() throws Exception {
        // 测试UserController
        RequestBuilder request = null;

        // 1、get查一下user列表，应该为空
        request = get("/users/");
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

        // 2、post提交一个user
        request = post("/users/")
                .param("id", "1")
                .param("name", "测试大师")
                .param("age", "20");
        mockMvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 3、get获取user列表，应该有刚才插入的数据
        request = get("/users/");
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[{\"id\":1,\"name\":\"测试大师\",\"age\":20}]")));

        // 4、put修改id为1的user
        request = put("/users/1")
                .param("name", "测试终极大师")
                .param("age", "30");
        mockMvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 5、get一个id为1的user
//        request = get("/users/1");
//        mockMvc.perform(request)
//                .andExpect(content().string(equalTo("User{\"id\"=1,\"name\"=\"测试终极大师\",\"age\"=30}")));

        // 6、del删除id为1的user
        request = delete("/users/1");
        mockMvc.perform(request)
                .andExpect(content().string(equalTo("success")));

        // 7、get查一下user列表，应该为空
        request = get("/users/");
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));

    } 


}
