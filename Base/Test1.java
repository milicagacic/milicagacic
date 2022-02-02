package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Test1 {
    private WebDriver driver;

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void login() {
        WebElement username=driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/text()[1]"));
        username.getText();
        WebElement usernamePolje=driver.findElement(By.id("id=\"user-name\""));
        usernamePolje.click();
        usernamePolje.sendKeys((CharSequence) username);
        WebElement password=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/text()"));
        password.getText();
        WebElement passwordPolje=driver.findElement(By.id("password"));
        passwordPolje.sendKeys((CharSequence) password);
        WebElement login=driver.findElement(By.id("login-button"));
        login.click();
    }



}
