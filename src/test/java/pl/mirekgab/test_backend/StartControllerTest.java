package pl.mirekgab.test_backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.equalTo;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureMockMvc
class StartControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void hello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/")
                .accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello world from version 0.3.0")));
    }

    @Test
    void mytext() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/mytext").accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("this is my text")));
    }

    @Test
    void hello1() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("hello1")));
    }
}