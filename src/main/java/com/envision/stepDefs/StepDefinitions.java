package com.envision.stepDefs;

import com.envision.pages.LoginPage;
import com.envision.pages.TimeTrackPage;
import com.envision.utils.CommonUtils;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class StepDefinitions {
    WebDriver driver;
    LoginPage lp;
    TimeTrackPage ttp;

    @Given("user launch the Chrome Browser")
    public void user_launch_the_chrome_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        lp = new LoginPage(driver);
    }
    @Then("user open the URL {string}")
    public void user_open_the_url(String url) {

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
    }
//---------LoginPage--------------------
    @When("user enter the user id {string}")
    public void user_enter_the_user_id(String uname) {
        lp.enterUserName(uname);
    }
    @When("user enter the Password {string}")
    public void user_enter_the_password(String pass) {
        lp.enterPassword(pass);
    }
    @When("user click Login")
    public void user_click() {
        lp.clickLogin();
    }
    @Then("user should see page title as {string}")
    public void user_should_see_page_title_as(String title) {
        CommonUtils.waitDefinite(2);
        Assert.assertEquals(title, driver.getTitle());
    }
    @Then("user click logout")
    public void user_click_logout() {
        lp.clickLogout();
    }
    @Then("user see the page title as {string}")
    public void user_see_the_page_title_as(String title) {
        CommonUtils.waitDefinite(2);
        Assert.assertEquals(title, driver.getTitle());
    }
    @Then("user should see error message as {string}")
    public void user_see_the_error_message(String msg) {
        CommonUtils.waitDefinite(2);
        Assert.assertEquals(msg, lp.errorMessage());
    }
    //----------------AddCustomer------------------
    @Then("user click the TaskTab")
    public void user_click_the_task_tab() {
        ttp=new TimeTrackPage(driver);
        ttp.clickTaskTab();
    }
    @Then("user click add new")
    public void user_click_add_new() {
        ttp.clickAddNew();
    }
    @Then("user click add new customer")
    public void user_click_add_new_customer() {
        ttp.clickAddNewCustomer();
    }
    @Then("user enter new customer as {string}")
    public void user_enter_new_customer_as(String cname) {
        ttp.enterNewCustomer(cname);
    }
    @Then("user enter new customer description as {string}")
    public void user_enter_new_customer_description_as(String desc) {
        ttp.enterNewCustomerDescription(desc);
    }
    @Then("user click create new")
    public void user_click_create_new() {
        ttp.clickCreateNew();
    }
    @Then("user validate the added customer")
    public void user_validate_the_added_customer() {
        ttp.validateCreatedUser();
    }
    @Then("user close the browser")
    public void user_close_the_browser() {
        driver.close();
    }
}
