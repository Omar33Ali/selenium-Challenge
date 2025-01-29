package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By productName = By.id("productTitle");
    By productPrice = By.cssSelector("#corePriceDisplay_desktop_feature_div .a-price-whole");
    By addToCartBtn = By.id("add-to-cart-button");
    By goToBasket = By.linkText("Go to basket");
    By noThanksBtn = By.cssSelector("#attachSiNoCoverage .a-button-input");
    By warrantyPane = By.id("attach-warranty-pane");


    public String getProductName()
    {
        return driver.findElement(productName).getText();
    }
    public String getProductPrice()
    {
        return driver.findElement(productPrice).getText();
    }

    public void addToCart()
    {
        driver.findElement(addToCartBtn).click();

    }

    public void cancelWarrantyPlan()
    {
        if(isWarrantyPaneDisplayed())
        {
            driver.findElement(noThanksBtn).click();
        }

    }

    public void goToBasket()
    {
        driver.findElement(goToBasket).click();

    }

    public boolean isWarrantyPaneDisplayed()
    {
        return driver.findElement(warrantyPane).isDisplayed();

    }
}
