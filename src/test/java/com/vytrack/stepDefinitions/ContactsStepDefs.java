package com.vytrack.stepDefinitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {

    @Given("the user loged in as {string}")
    public void the_user_loged_in_as(String userType) {
        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equals("driver")) {
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        } else if (userType.equals("sales manager")) {
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        } else if (userType.equals("store manager")) {
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        //send username and password
        new LoginPage().login(username, password);

    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {
         BrowserUtils.waitFor(5);
        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(menuOptions,actualOptions);

        System.out.println("menuOptions = "+ menuOptions);
        System.out.println("actualOptions = " + actualOptions);


    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userInfo) {
        System.out.println("userInfo = " + userInfo);

        new LoginPage().login(userInfo.get("username"),userInfo.get("password"));

        String expectedName = userInfo.get("firstname")+" "+userInfo.get("lastname");
        String actualName = new DashboardPage().getUserName();
        Assert.assertEquals(expectedName,actualName);

        System.out.println("actualname = " + actualName);
        System.out.println("expectedname = " + expectedName);


    }
}
