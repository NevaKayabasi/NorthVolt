package com.northvolt.step_def;

import com.northvolt.pages.HP;
import com.northvolt.utilities.ConfigurationReader;
import com.northvolt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HP_01 {

    HP hp = new HP();

    @Given("the user goes to the Northvolt Page")
    public void the_user_goes_to_the_northvolt_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Then("the user verifies that the url is {string}")
    public void the_user_verifies_that_the_url_is(String url) {

        Assert.assertEquals(url, Driver.getDriver().getCurrentUrl());
    }
    @Then("the user verifies the title {string}")
    public void the_user_verifies_the_title(String title) {

      Assert.assertEquals(title , hp.northVoltLogo.getText() );

    }

}
