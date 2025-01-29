package testPackage;


import org.testng.Assert;
import org.testng.annotations.Test;
import pagesPackage.HomePage;
import pagesPackage.ProductPage;
import pagesPackage.ResultPage;
import pagesPackage.ShoppingCartPage;
import utils.TestBase;


public class TestClass extends TestBase {


    @Test
    public void validateProductNameAndPrice(){

        String productToSearch ="ipad";
        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = new ResultPage(driver);
        ProductPage productPage = new ProductPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);

        //Search for the word “iPad”
        homePage.enterSearchString(productToSearch);
        homePage.clickOnSearch();

        //Sort the result with filter “Price:high to low”
        resultPage.clickOnSortBy();
        resultPage.selectHighToLowSorting();

        //Open the first search result
        resultPage.clickOnFirstResult();

        //Save the name and price
        String productName = productPage.getProductName();
        String productPrice = productPage.getProductPrice();

        //Add the item to cart
        productPage.addToCart();
        productPage.cancelWarrantyPlan();

        //Navigate to Shopping Cart
        productPage.goToBasket();

        //Assert on the name and price listed in the cart
        Assert.assertEquals(shoppingCartPage.getProductNameInCart(),productName);
        Assert.assertEquals(shoppingCartPage.getProductPriceInCart(),productPrice);

    }


}
