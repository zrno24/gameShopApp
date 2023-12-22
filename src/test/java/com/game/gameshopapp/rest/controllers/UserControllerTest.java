package com.game.gameshopapp.rest.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.game.gameshopapp.core.service.AuthService;
import com.game.gameshopapp.rest.dto.LoginDTO;
import com.game.gameshopapp.rest.dto.LoginRequestDTO;
import com.jayway.jsonpath.JsonPath;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@AutoConfigureMockMvc
@SpringBootTest
public class UserControllerTest {

    static String jwtToken;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    AuthService authService;

    @BeforeEach
    public void init() throws Exception {
        if (jwtToken == null) {
            LoginRequestDTO login = new LoginRequestDTO("test@test.com", "test123");
            LoginDTO jwt = new LoginDTO("eyJhbGciOiJIUzM4NCJ9.eyJzdWIiOiJzdHJpbmciLCJpYXQiOjE3MDMyMTc2MjIsImV4cCI6MTcwMzIxOTA2Mn0.ZN_mWJXJB-JntFoDq_BDqLQ4ULQXAbkCJRCVITLSKk_Mnhc7nGelkLS-aYxc1QFp");

            ObjectMapper objectMapper = new ObjectMapper();
            String requestBody = objectMapper.writeValueAsString(login);

            Mockito.when(authService.signIn(ArgumentMatchers.any(LoginRequestDTO.class))).thenReturn(jwt);

            MvcResult result = mockMvc.perform(
                            MockMvcRequestBuilders
                                    .post("/api/auth/login")
                                    .contentType(MediaType.APPLICATION_JSON)
                                    .content(requestBody))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andReturn();


            System.out.println("###### " + result.getResponse().getContentAsString());

            String response = result.getResponse().getContentAsString();
            jwtToken = JsonPath.read(response, "$.jwt");
        }
    }

    @Test
    void shouldGetAllUsers() throws Exception {

        System.out.println("BEFORE HAS BEEN EXECUTED <--> ".concat(jwtToken));
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders
                .get("/api/users/")
                .header("Authorization", "Bearer " + jwtToken)).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        System.out.println(result);
    }


}



