package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.Keys.ENTER;

public class Vezbanje2 {

    public static void main(String[] args) {
        //Zadatak 2 - Otici na sajt wikipedia i pronaci clanak o Nikoli Tesli

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");

        WebElement searchBox=driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        searchBox.click();
        searchBox.sendKeys("Nikola Tesla");
        searchBox.sendKeys(ENTER);
    }
}
