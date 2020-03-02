package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest2 { // Selenium Test
    private WebDriver driver;

    public void setUp() {
        System.setProperty ( "webdriver.chrome.driver", "resources/chromedriver" );
        driver=new ChromeDriver ();
        driver.get ( "http://www.amazon.com.tr" );
        driver.findElement ( (By.className ( "nav-line-1" )) ).click ();
        driver.findElement ( By.id ( "ap_email" ) ).sendKeys ( "bulentselcuk@gmail.com" );
        driver.findElement ( By.id ( "continue" ) ).click ();
        driver.findElement ( By.id ( "ap_password" ) ).sendKeys ( "906090Meltem$" );
        driver.findElement ( By.id ( "signInSubmit" ) ).click ();
        driver.quit ();
        System.out.println ( "TEST SUCCESFULLY" );
    }

    public static void main(String[] args) {
        AmazonTest2 amazonTest2=new AmazonTest2 ();
        amazonTest2.setUp ();


    }
}

