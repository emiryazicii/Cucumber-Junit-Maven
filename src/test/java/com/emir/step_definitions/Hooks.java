package com.emir.step_definitions;

import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setupMethod(){
        System.out.println("--->@Before: RUNNING BEFORE EACH SCENARIO");
    }
}
