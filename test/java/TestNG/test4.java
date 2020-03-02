package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class test4 {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty ( "webdriver.chrome.driver", "resources/chromedriver" );
        driver=new ChromeDriver ();
    }

    @Test
    public void BulentSelcuk() {
//        driver.get("https://bulentselcuk.wixsite.com/bulentselcuk/info");
        driver.get ( "http://bulentselcuk.wix.com/bulentselcuk" );
//        driver.findElement ( By.id ( "DrpDwnMn07label" ) ).click ();
//        driver.get ( "https://www.amazon.com/Diren-Gezi-Bulent-Selcuk/dp/9753438591" );
//        driver.get ( "http://www.kaynakyayinlari.com/diren-gezi-p362986.html" );
//        driver.get ( "http://bulentselcuk.wix.com/bulentselcuk" );
//        driver.findElement ( By.id ( "DrpDwnMn02label" ) ).click ();
//        driver.findElement ( By.id ( "DrpDwnMn03label" ) ).click ();
//        driver.findElement ( By.id ( "DrpDwnMn05label" ) ).click ();
//        driver.findElement ( By.id ( "DrpDwnMn06label" ) ).click ();
        driver.findElement ( By.id ( "DrpDwnMn08label" ) ).click ();
        driver.manage ().timeouts ().implicitlyWait ( 5, TimeUnit.SECONDS ); // Kodu Geciktirmek icin
        driver.findElement ( By.id ( "field1" ) ).sendKeys ( "Fatih" );
        driver.findElement ( By.id ( "field2" ) ).sendKeys ( "bradselcuk@gmail.com" );
        driver.findElement ( By.id ( "CntctFrm1-ohtfieldMessage" ) ).sendKeys ( "jsdsajhfsj jhgsadjhsadfjagsDF12345" );
        driver.findElement ( By.id ( "CntctFrm1-ohtsubmit" ) ).click ();
//        driver.findElement ( By.id ( "DrpDwnMn04bg" ) ).click ();
//        driver.get("https://www.paypal.com/webapps/hermes?token=4JP72520SL236103D&useraction=commit&mfid=1582211232856_f305b0c24fcaf#/checkout/signup");


    }

    @AfterTest
    public void tearDown() {

//        driver.quit ();
    }
}