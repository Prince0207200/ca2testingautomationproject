package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By terms = By.id("termsofservice");
    By checkoutBtn = By.id("checkout");

    public void checkout() {
        driver.findElement(terms).click();
        driver.findElement(checkoutBtn).click();
    }
}