package com.envision.pages;

import com.envision.filereaders.FileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void enterUserName(String uname) {
        String customLocator = FileReader.getPropertyValue("at.loginpage.username.locator");
        WebElement userElement = super.getElement(customLocator);
        userElement.sendKeys(uname);
    }

    public void enterPassword(String password) {
        String customLocator = FileReader.getPropertyValue("at.loginpage.password.locator");
        WebElement passwordElement = super.getElement(customLocator);
        passwordElement.sendKeys(password);
    }

    public void clickLogin() {
        String customLocator = FileReader.getPropertyValue("at.loginpage.login.locator");
        WebElement clickLoginElement = super.getElement(customLocator);
        clickLoginElement.click();
    }

    public void clickLogout() {
        String customLocator = FileReader.getPropertyValue("at.timetrackpage.logout_link");
        WebElement clickLogoutElement = super.getElement(customLocator);
        clickLogoutElement.click();
    }

    public String errorMessage() {
        String customLocator = FileReader.getPropertyValue("at.loginpage.errormessage.locator");
        WebElement clickLoginElement = super.getElement(customLocator);
        return clickLoginElement.getText();
    }


}
