package cydeo.step_definitions;

/*
In the class we will be able to pass pre- & post- conditions each scenario and each step
 */

import cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.SQLOutput;

public class Hooks {

    //import from io.cucumber.java not from junit
    @Before(order = 1)
    public void setupScenario(){
        //System.out.println("======Setting up browser using cucumber @Before");
    }

    @Before(value = "@login",order = 2)
    public void setupScenarioForLogins(){
        //System.out.println("======this will only apply to scenarios with @login tag");
    }

    @Before(value = "@db", order = 0)
    public void setupForDatabaseScenarios(){
        //System.out.println("======this will only apply to scenarios with @db tag");
    }

    @After
    public void tearDownScenario(Scenario scenario){

        if(scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
        //System.out.println("=====Closing browser using cucumber @After");
        //System.out.println("=====Scenario ended/ Take Screenshot if Failed");
    }

    @BeforeStep
    public void setupStep(){
        //System.out.println("-------------applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        //System.out.println("-------------applying tearDown using @AfterStep");
    }


}
