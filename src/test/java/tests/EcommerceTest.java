package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchPage;
import pages.CartPage;
import pages.CheckoutPage;

public class EcommerceTest extends BaseTest {

    @Test
    public void fullFlowTest() {

        // Login
        LoginPage lp = new LoginPage(driver);
        lp.login("test@test.com", "123456");

        // Search
        SearchPage sp = new SearchPage(driver);
        sp.searchProduct("laptop");

        // Add to Cart
        CartPage cp = new CartPage(driver);
        cp.addToCart();
        cp.openCart();

        // Checkout
        CheckoutPage chk = new CheckoutPage(driver);
        chk.checkout();
    }
}