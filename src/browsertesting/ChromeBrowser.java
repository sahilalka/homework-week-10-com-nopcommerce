package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl =" https://demo.nopcommerce.com/login?returnUrl=%2";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open the URL into Browser
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

        System.out.println("Current URL  : "  +  driver.getCurrentUrl());

        // Get page Source
        System.out.println("Page source  : "   + driver.getCurrentUrl());

        // Find the email field Element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Foxfield13@gmail.com");

        // Find the password field and type the password
        driver.findElement(By.name("Password")).sendKeys("Pandya119");

        // Close the Browser
        driver.close();






    }




}
