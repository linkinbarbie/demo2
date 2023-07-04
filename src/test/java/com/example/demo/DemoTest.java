package com.example.demo;

import Controllers.CovidRestClient;
import Models.TeamNames;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoTest {


    @SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
    class DemoTests {

        @Autowired
        CovidRestClient covidClient;

        @Test
        public void testGetTotals() {
            TeamNames names = covidClient.getNames();
            System.out.println("Confirmed: " + names.getKey1());
            System.out.println("Deaths: " + names.getKey2());
            System.out.println("Recovered: " + names.getAdditionalProperties());
         //   assertTrue(Boolean.parseBoolean(names.getAdditionalProperties() = "true"));
        }
    }
}
