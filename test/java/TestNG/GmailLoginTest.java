package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GmailLoginTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty ( "webdriver.chrome.driver", "resources/chromedriver" );
        driver=new ChromeDriver ();
    }

    @Test
    public void GmailLogin() throws Exception {
        driver.get ( "https://mail.google.com/" );
//        driver.manage ().window ().maximize ();
        driver.findElement ( By.id ( "identifierId" ) ).sendKeys ( " bulentselcuk@gmail.com" );
        driver.findElement ( By.xpath ( "//span[@class='RveJvd snByac']" ) ).click ();
        driver.findElement ( By.xpath ( "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input" ) ).sendKeys ( "Lakota1890Bulent67" );

        Thread.sleep ( 2000 );
    }

    @AfterTest
    public void tearDown() {
        //driver.quit ();
    }
}