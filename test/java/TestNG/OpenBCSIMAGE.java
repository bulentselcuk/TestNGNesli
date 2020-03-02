package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class OpenBCSIMAGE {
    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty ( "webdriver.chrome.driver", "resources/chromedriver"  );
        driver = new ChromeDriver (  );
    }
    @Test
    public void BCSIMAGE(){
        driver.get("http://bulentselcuk.wix.com/bulentselcuk");
        driver.findElement ( By.id ( "DrpDwnMn07label" ) ).click ();
    }
    @AfterClass
    public void tearDown() throws InterruptedException { // gecicmeden dolayi yazilacak...
     driver.quit ();
        System.out.println (" >>>> Test has succesfully <<<<");
        Thread.sleep(10);// Exception firlatmak gerekli...
    }
}