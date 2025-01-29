package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ResultPage {

    WebDriver driver;

    public ResultPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Result page locators

    By sortBy = By.id("a-autoid-0-announce");
    By highToLow = By.id("s-result-sort-select_2");
    By firstResult = By.cssSelector("div[data-cel-widget=\"search_result_1\"]");



    //Result page actions

    public void clickOnSortBy()
    {
        driver.findElement(sortBy).click();
    }

    public void selectHighToLowSorting()
    {
        driver.findElement(highToLow).click();
    }

    public  void clickOnFirstResult()
    {
        driver.findElement(firstResult).click();
    }



}
