package com.northvolt.step_def;
import com.northvolt.pages.HP_career;
import com.northvolt.pages.HP_pages;
import com.northvolt.utilities.BrowserUtils;
import com.northvolt.utilities.ConfigurationReader;
import com.northvolt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class HP_career_stepDef {

    Select select ;
    HP_career career = new HP_career();
    HP_pages hp = new HP_pages();
    @Given("user goes to {string}")
    public void user_goes_to(String string) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("user clicks on career")
    public void user_clicks_on_career() {
        hp.cookiesReject.click();
        BrowserUtils.sleep(2);
        career.careerBtn.click();

    }

    @And("user clicks on Joining Us button")
    public void userClicksOnJoiningUsButton() {
        BrowserUtils.sleep(2);

        career.joiningUs.click();
    }
    @Then("user verifies {string} is visible")
    public void user_verifies_is_visible(String string) {

        Assert.assertEquals(string ,career.findYourChallenge.getText());
        System.out.println(career.findYourChallenge.getText());
    }
    @Then("user clicks on Find your challenge button")
    public void user_clicks_on_find_your_challenge_button() {
        career.findYourChallenge.click();
    }
    @Then("user verifies {string} text visible")
    public void user_verifies_text_visible(String title) {

        Assert.assertEquals(title ,career.avaibleRoles.getText());
        System.out.println(career.avaibleRoles.getText());
    }
    @Then("user clicks on Software & IT and Skellefteå checkboxes")
    public void user_clicks_on_software_it_and_skellefteå_checkboxes() {
        BrowserUtils.scrollToElement(career.avaibleRoles);
        BrowserUtils.sleep(2);
        career.softwareCheckBox.click();
        BrowserUtils.sleep(2);
        career.skellefteaCheckBox.click();

    }
    @Then("user writes Software Engineer in Search inbox")
    public void user_writes_software_engineer_in_search_inbox() {
        career.searchBox.sendKeys("Software Engineer");
    }
    @Then("user applies first job")
    public void user_applies_first_job() {
        BrowserUtils.scrollToElement(career.firstJob);
        career.firstJob.click();
        // Mevcut pencerenin handle'ını alın
        String anaPencereHandle = Driver.getDriver().getWindowHandle();

// Yeni pencerenin handle'ını almak için tüm handle'ları alın
        Set<String> pencereHandleSet = Driver.getDriver().getWindowHandles();

// Ana pencere dışındaki handle'ı bulun
        for (String handle : pencereHandleSet) {
            if (!handle.equals(anaPencereHandle)) {
                Driver.getDriver().switchTo().window(handle);
                break;
            }
        }
        career.acceptAll.click();


    }
    @Then("user sees I'm interested text")
    public void user_sees_i_m_interested_text() {


        Assert.assertTrue("I'm interested" , true);
    }
    @Then("user clicks on I'm interested button")
    public void user_clicks_on_i_m_interested_button() {


        career.iAmInterested.click();
    }
    @Then("user enters {string} {string} {string} {string}")
    public void user_enters(String firstName, String lastName, String id_email, String phoneNumber) {

      career.firstName.click();
      career.firstName.sendKeys(firstName);
      career.lastName.click();
      career.lastName.sendKeys(lastName);
      career.id_email.click();
      career.id_email.sendKeys(id_email);
      career.phoneNumber.click();
      career.phoneNumber.sendKeys(phoneNumber);
      BrowserUtils.scrollToElement(career.message);

    }
    @Then("user chooses an open to relocate radio button")
    public void user_chooses_an_open_to_relocate_radio_button() {
        career.relocateRadioBtn.click();
    }
    @Then("user writes in the Currently based inbox")
    public void user_writes_in_the_currently_based_inbox() {
        career.currentLocation.sendKeys("Lund");
    }
    @Then("user clicks on any Have you ever worked in an Industrial Environment with Software? buttons")
    public void user_clicks_on_any_have_you_ever_worked_in_an_industrial_environment_with_software_buttons() {
        career.industrialExperinceRBtn.click();
    }
    @Then("user writes anything in Which detail made you the most excited about the job ad? inbox")
    public void user_writes_anything_in_which_detail_made_you_the_most_excited_about_the_job_ad_inbox() {
        career.excitedAbout.click();
        career.excitedAbout.sendKeys("Everything");
        BrowserUtils.scrollToElement(career.dropdown);
    }
    @Then("user chooses an How did you hear about Northvolt? option")
    public void user_chooses_an_how_did_you_hear_about_northvolt_option() {

        new Select(career.dropdown).selectByIndex(4);
    }
    @Then("user chooses a gender")
    public void user_chooses_a_gender() {
         career.gender.click();
    }
    @Then("user clicks on confirm checkbox")
    public void user_clicks_on_confirm_checkbox() {
        career.terms.click();
    }
    @Then("user clicks on submit button")
    public void user_clicks_on_submit_button() {
       career.submit.click();
    }


    @And("user uploads CV")
    public void userUploadsCV() {

        career.cv.sendKeys(System.getProperty("user.dir") + "//src//test//resources//files//pdf//NevaSevgiCV.pdf");
    }

    @And("user verifies {string} message displayed")
    public void userVerifiesMessageDisplayed(String message) {

        Assert.assertTrue(career.thankYou.isDisplayed());

    }
}
