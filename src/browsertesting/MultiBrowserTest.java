package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Chrome";
    static String baseUrl = " https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        } else {
            System.out.println("Wrong Browser name");

            driver.manage().window().maximize();
            driver.get(baseUrl);
            System.out.println(driver.getTitle());

            // Open the Url into Browser
            driver.get(baseUrl);

            // Maximize the Browser
            driver.manage().window().maximize();

            // we give implicit wait to driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

            // Get the title of the page
            String title = driver.getTitle();

            System.out.println(title);

            // Get the current URL
            driver.getCurrentUrl();

            System.out.println("Current URL  : " + driver.getCurrentUrl());

            // Get page Source
            System.out.println("Page source  : " + driver.getCurrentUrl());

            // Find the email field Element
            WebElement emailField = driver.findElement(By.id("Email"));
            emailField.sendKeys("Foxfield13@gmail.com");

            // Find the password field and type the password
            driver.findElement(By.name("Password")).sendKeys("Pandya119");

            // Close the Browser
            driver.close();


        }

    }

}














