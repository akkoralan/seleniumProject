package com.vytrack.stepDefinitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("\tthis is coming from before");
    }

    @After
    public void tearDown(Scenario scenario){
        Driver.closeDriver();

    }

    @Before("@db")
public void setUpDb(){
        System.out.println("\tconnecting Database..");
    }
    @After("@db")
    public void tearDownDb(){
        System.out.println("\tdisconnecting from Database..\n");
    }
}
