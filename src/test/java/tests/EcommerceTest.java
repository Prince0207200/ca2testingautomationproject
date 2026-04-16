package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.SearchPage;
import pages.CartPage;
import pages.CheckoutPage;

public class EcommerceTest extends BaseTest {

    // 🔴 HIGH RISK
    @Test(priority = 1, groups = {"high"})
    public void loginTest() {
        LoginPage lp = new LoginPage(driver);
        lp.login("test@test.com", "123456");
    }

    // 🔴 HIGH RISK
    @Test(priority = 2, groups = {"high"})
    public void checkoutTest() {
        LoginPage lp = new LoginPage(driver);
        lp.login("test@test.com", "123456");

        SearchPage sp = new SearchPage(driver);
        sp.searchProduct("laptop");

        CartPage cp = new CartPage(driver);
        cp.addToCart();
        cp.openCart();

        CheckoutPage chk = new CheckoutPage(driver);
        chk.checkout();
    }

    // 🟡 MEDIUM RISK
    @Test(priority = 3, groups = {"medium"})
    public void cartTest() {
        LoginPage lp = new LoginPage(driver);
        lp.login("test@test.com", "123456");

        SearchPage sp = new SearchPage(driver);
        sp.searchProduct("laptop");

        CartPage cp = new CartPage(driver);
        cp.addToCart();
        cp.openCart();
    }

    // 🟡 MEDIUM RISK 
    @Test(priority = 4, groups = {"medium"})
    public void searchTest() {
        SearchPage sp = new SearchPage(driver);
        sp.searchProduct("laptop");
    }
}