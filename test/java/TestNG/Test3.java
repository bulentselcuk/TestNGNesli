package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
    }
    @Test
    public void facebook() {
        driver.get("https://facebook.com/");
        driver.findElement ( By.id("email") ).sendKeys("bulentselcuk@gmail.com");
        driver.findElement ( By.id("pass") ).sendKeys("Lakota1890Bulent67");
        driver.findElement ( By.id ("u_0_b")).click ();

    }
    @AfterTest
    public void tearDown() {

        driver.quit ();
        System.out.println ("Test Basarili");
    }
}