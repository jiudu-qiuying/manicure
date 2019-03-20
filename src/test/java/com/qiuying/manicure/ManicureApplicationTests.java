package com.qiuying.manicure;

import com.qiuying.manicure.event.controller.EventInfoController;
import com.qiuying.manicure.event.service.EventInfoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ManicureApplicationTests {

    private MockMvc mockMvc;

    @Autowired
    private EventInfoService eventInfoService;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new EventInfoController()).build();
    }

    @Test
    public void contextLoads() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/list").accept(MediaType.APPLICATION_JSON));

        System.out.println(content());

    }

    @Test
    public void test() throws Exception {
        eventInfoService.list();
    }





}
