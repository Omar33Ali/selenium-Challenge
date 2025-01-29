package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Home page locators

    By searchField = By.id("twotabsearchtextbox");
    By searchBtn = By.id("nav-search-submit-button");


    //Home page actions

    public void enterSearchString(String item)
    {
        driver.findElement(searchField).sendKeys(item);

    }

    public void clickOnSearch()
    {
        driver.findElement(searchBtn).click();
    }



}
