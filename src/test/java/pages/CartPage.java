package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By addToCartBtn = By.xpath("(//input[@value='Add to cart'])[1]");
    By shoppingCart = By.linkText("Shopping cart");

    public void addToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public void openCart() {
        driver.findElement(shoppingCart).click();
    }
}