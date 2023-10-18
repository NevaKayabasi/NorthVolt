package com.northvolt.pages;

import com.northvolt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HP_pages {


    public HP_pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='c-logo o-row']")
    public WebElement northVoltLogo;

    @FindBy (xpath = "//*[.='Reject all']")
    public WebElement cookiesReject;
}
