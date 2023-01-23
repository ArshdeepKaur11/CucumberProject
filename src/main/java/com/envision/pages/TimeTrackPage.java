package com.envision.pages;

import com.envision.filereaders.FileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage extends BasePage {
    WebDriver driver;
    public TimeTrackPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void clickTaskTab() {
        String customLocator = FileReader.getPropertyValue("at.timetrackpage.tasks_link");
        WebElement taskTabElement = super.getElement(customLocator);
        taskTabElement.click();
    }
    public void clickAddNew() {
        String customLocator = FileReader.getPropertyValue("at.taskList.addnewbutton");
        WebElement addElement = super.getElement(customLocator);
        addElement.click();
    }
    public void clickAddNewCustomer() {
        String customLocator = FileReader.getPropertyValue("at.taskList.addnewcustomer");
        WebElement addElement = super.getElement(customLocator);
        addElement.click();
    }
    public void enterNewCustomer(String name) {
        String customLocator = FileReader.getPropertyValue("at.taskList.enternewcustomer");
        WebElement addElement = super.getElement(customLocator);
        addElement.sendKeys(name);
    }
    public void enterNewCustomerDescription(String name) {
        String customLocator = FileReader.getPropertyValue("at.taskList.enternewcustomerdescription");
        WebElement addElement = super.getElement(customLocator);
        addElement.sendKeys(name);
    }
    public void clickCreateNew() {
        String customLocator = FileReader.getPropertyValue("at.taskList.createnewbutton");
        WebElement addElement = super.getElement(customLocator);
        addElement.click();
    }
    public void validateCreatedUser() {
        String customLocator = FileReader.getPropertyValue("at.taskList.customer");
        WebElement addElement = super.getElement(customLocator);
        addElement.isDisplayed();
    }
    public void editCreatedUser() {
        String customLocator = FileReader.getPropertyValue("at.taskList.editcustomer");
        WebElement addElement = super.getElement(customLocator);
        addElement.click();
    }
    public void clickActions() {
        String customLocator = FileReader.getPropertyValue("at.taskList.actions");
        WebElement addElement = super.getElement(customLocator);
        addElement.click();
    }
    public void clickDelete() {
        String customLocator = FileReader.getPropertyValue("at.taskList.delete");
        WebElement addElement = super.getElement(customLocator);
        addElement.click();
    }
    public void clickDeletePermanetly() {
        String customLocator = FileReader.getPropertyValue("at.taskList.deletepermanently");
        WebElement addElement = super.getElement(customLocator);
        addElement.click();
    }
}
