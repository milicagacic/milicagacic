package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Selenium {
    public static void main(String[] args) {
     ////Zadatak 1 - Otici na Google, povecati prozor, odraditi refresh, otici na youtube, vratiti se nazad
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();

    }
}
