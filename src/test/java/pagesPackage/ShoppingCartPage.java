package pagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {

    WebDriver driver;

    public ShoppingCartPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By productName = By.cssSelector(".a-truncate-full");
    By productPrice = By.cssSelector(".a-price-whole");

    public String getProductNameInCart()
    {
        WebElement productName = driver.findElement(this.productName);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        return (String) jsExecutor.executeScript("return arguments[0].innerText;", productName);
    }
    public String getProductPriceInCart()
    {
        WebElement productPrice = driver.findElement(this.productPrice);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        return (String) jsExecutor.executeScript("var price = arguments[0].innerText;"+"return price.replace('.', '').trim();", productPrice);

    }
}
