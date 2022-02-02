package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static net.jodah.failsafe.internal.util.Assert.*;

public class vezbanje4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.navigate().to("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");

        WebElement username = driver.findElement(By.id("usernameOrEmail"));
        username.sendKeys("vezbanje12");

        WebElement continueButton = driver.findElement(By.className("login__form-action"));
        continueButton.click();

        WebElement password = driver.findElement(By.id("password"));
        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        password.sendKeys("Qwerty123");

        continueButton.click();


        wdwait.until(ExpectedConditions.urlToBe("https://wordpress.com/read"));

        String expectedURL = "https://wordpress.com/read";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(expectedURL, actualURL);

        WebElement profileButton = driver.findElement(By.className("gravatar"));
        Assert.assertTrue(profileButton.isDisplayed());
        profileButton.click();

        wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button.sidebar__me-signout-button.is-compact")));
        WebElement logOutButton = driver.findElement(By.cssSelector(".button.sidebar__me-signout-button.is-compact"));
        Assert.assertTrue(logOutButton.isDisplayed());


    }
}
