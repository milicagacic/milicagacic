package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

//Za domaci:
//Napisati program koji racuna sumu brojeva koji se nalaze prvom sheet-u excel tabele koji se zove Brojevi (sami izaberite neke random brojeve).
// U tabeli svi brojevi se nalaze u prvoj koloni. Program treba da cita red po red iz tabele i upisane brojeve dodaje na sumu.
// Ukupnu sumu na kraju treba ispisati na standardnom izlazu. Potrebno je omoguciti da program radi i ukoliko se u datu tabelu doda jos brojeva.

// public int getLastRow(String sheet) {
//     this.sheet = wb.getSheet(sheet);
//     return this.sheet.getLastRowNum();
//  }

public class BasePage {
   // public WebDriver driver;
   // public WebDriverWait wdwait;
    public ExcelReader excelReader;

    @BeforeClass
    public void setUp() throws IOException {
      //  WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver();
       // wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        excelReader=new ExcelReader("C:\\Users\\VENGEANCE\\Desktop\\Micine Stvarcice\\Book1.xlsx");


    }

  /*  @AfterClass
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    } */
}
