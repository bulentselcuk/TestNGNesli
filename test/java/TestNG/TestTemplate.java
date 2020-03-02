package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTemplate {

    private WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty ( "webdriver.chrome.driver", "resources/chromedriver"  );
        driver = new ChromeDriver (  );
    }
    /*BURAYA TEST YAZIYORUZ!!!............*/

//    @Test
//
//    public void Amazon(){
//        driver.get("http://www.amazon.com.tr");
//        driver.findElement ( (By.className ("nav-line-1")) ).click ();
//        driver.findElement ( By.id("ap_email" )).sendKeys ( "bulentselcuk@gmail.com" );
//        driver.findElement ( By.id("continue")).click ();
//        driver.findElement ( By.id("ap_password") ).sendKeys ( "906090Meltem$" );
//        driver.findElement ( By.id ("signInSubmit")).click ();
//    }

    @AfterTest
    public void tearDown(){
      driver.quit ();
        System.out.println ("Test has succesfully");
        System.out.println ("A message will come to your cellphone");
    }
}
