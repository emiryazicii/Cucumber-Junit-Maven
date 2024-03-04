package com.emir.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void setupMethod(){
        System.out.println("--->@Before: RUNNING BEFORE EACH SCENARIO");
    }

    @After
    public void tearDown(){
        System.out.println("---> @After: RUNNING AFTER EACH SCENARIO");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("----->@BeforeStep: RUNNING BEFORE EACH STEP");
    }

    @AfterStep
    public void tearDownStep(){
        System.out.println("------>@AfterStep: RUNNING AFTER EACH STEP");
    }
}
