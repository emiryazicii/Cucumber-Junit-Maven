package com.emir.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setupMethod(){
        System.out.println("--->@Before: RUNNING BEFORE EACH SCENARIO");
    }

    @After
    public void tearDown(){
        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");
    }
}
