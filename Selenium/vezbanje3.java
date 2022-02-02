package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static org.openqa.selenium.Keys.ENTER;
//Otvoriti 3 taba, svaki tab treba da odlazi na poseban URL (po vasoj zelji koji), sacekati 2 sekunde u svakom tabu i zatvoriti sve tabove
public class vezbanje3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");

        ArrayList<String>listaTabova= new ArrayList<String>(driver.getWindowHandles());

        driver.switchTo().window(listaTabova.get(1));
        driver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");
        Thread.sleep(2000);

        driver.switchTo().window(listaTabova.get(2));
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);

        driver.switchTo().window(listaTabova.get(3));
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);
        driver.close();

        driver.switchTo().window(listaTabova.get(2));
        driver.close();

        driver.switchTo().window(listaTabova.get(1));
        driver.close();

        driver.switchTo().window(listaTabova.get(0));
        driver.close();

        



    }
}
