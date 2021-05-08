package com.vytrack.stepDefinitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {

    @When("the user enter Sales Manager information")
    public void the_user_enter_Sales_Manager_information() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        loginPage.login(username,password);
    }
    @When("the user enter store manager information")
    public void the_user_enter_store_manager_information() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        loginPage.login(username,password);
    }


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
          WebDriver driver = Driver.get();
       driver.get(url);
       Driver.get().get(url);

       // WebDriverManager.chromedriver().setup();
     //   WebDriver driver = new ChromeDriver();
        //driver.get("https://qa3.vytrack.com");

    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(5);
        String title = Driver.get().getTitle();
        Assert.assertEquals("Verify title","Dashboard",title);

    }
    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }
    @Then("the title contain {string}")
    public void the_title_contain(String expectedTitle) {
        BrowserUtils.waitFor(5);
        System.out.println("\"expectedtitle\" =" + expectedTitle);

        Assert.assertTrue("Actual Title"+Driver.get().getTitle(),Driver.get().getTitle().contains(expectedTitle));

    }






}
