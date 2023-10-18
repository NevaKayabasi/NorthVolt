package com.northvolt.pages;

import com.northvolt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HP_career {

    public HP_career(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@class='c-topnav__item'][3]")
    public WebElement careerBtn;

    @FindBy (xpath = "(//a[.='Joining us'])[1]")
    public WebElement joiningUs;

    @FindBy (xpath = "//*[.='Find your challenge']")
    public WebElement findYourChallenge;

    @FindBy (xpath = "//*[.='Available roles']")
    public WebElement avaibleRoles;

    @FindBy (xpath = "(//*[@class='c-departmentFilter__checkbox'])[11]")
    public WebElement softwareCheckBox;

    @FindBy (xpath = "(//*[@class='c-locationFilter__checkbox'])[7]")
    public WebElement skellefteaCheckBox;

    @FindBy (id="inp")
    public WebElement searchBox;

    @FindBy (xpath = "//*[@class='c-departmentJobs__list']/li[1]")
    public WebElement firstJob;

    @FindBy (xpath = "(//*[@class='btn btn-huge btn-success btn-embossed btn-block mbl'])")
    public WebElement iAmInterested;

    @FindBy (id = "id_first_name")
    public WebElement firstName;

    @FindBy (id = "id_last_name")
    public WebElement lastName;

    @FindBy (id = "id_email")
    public WebElement id_email;

    @FindBy (xpath = "//*[@data-target-id=\"id_phone_number\"]")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@class='cc_btn cc_btn-primary']")
    public WebElement acceptAll;


}
