package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.Keys.ENTER;
// Postoji pesma koja je himna ITBootcampa: https://www.youtube.com/watch?v=dQw4w9WgXcQ
//Vas domaci zadatak je da otvorite pretrazivac, odete na youtube i pustite Rick Astley-a
public class domaci {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.rs");
        WebElement searchBox = driver.findElement(By.name("q"));

        searchBox.sendKeys("YouTube");
        searchBox.sendKeys(Keys.ENTER);

        WebElement youTube = driver.findElement(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));
        youTube.click();

        WebElement search=driver.findElement(By.name("search_query"));
        search.sendKeys(" Rick Astley - Never Gonna Give You Up (Official Music Video)");
        Thread.sleep(2000);
        search.sendKeys(ENTER);

        WebElement pesma=driver.findElement(By.className("style-scope ytd-video-renderer"));
        Thread.sleep(2000);
        pesma.click();



    }
}
