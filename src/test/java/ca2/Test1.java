package ca2;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

    public static void main(String[] args) {

        // Setup driver automatically
        WebDriverManager.chromedriver().setup();

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://demowebshop.tricentis.com/");

        // Print title
        System.out.println("Title: " + driver.getTitle());

        // Close browser
        driver.quit();
    }
}