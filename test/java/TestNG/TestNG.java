package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.By.name;
import static org.openqa.selenium.By.xpath;

public class TestNG {

    private WebDriver driver;
    public static String loginUrl = "https://facebook.com/";

    @BeforeTest
    public void setUp() {

        try {

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            System.setProperty("webdriver.chrome.driver","resources/chromedriver");
            driver = new ChromeDriver(capabilities);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

//            //dynamic wait
//            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//            driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void facebook() {
        driver.get(loginUrl);
        driver.findElement ( By.id("email") ).sendKeys("bulentselcuk@gmail.com");
        driver.findElement ( By.id("pass") ).sendKeys("Lakota1890Bulent67");
        driver.findElement ( By.id ("u_0_b")).click ();

//
//        try {
//            driver.get(loginUrl);
//            driver.findElement ( By.id("email") ).sendKeys("bulentselcuk@gmail.com");
////            Thread.sleep(1000);
//            driver.findElement ( By.id("pass") ).sendKeys("Lakota1890Bulent67");
////            Thread.sleep(1000);
//            driver.findElement ( By.id ("u_0_b")).click ();
//            Thread.sleep(1);
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }
    }
    @AfterTest
    public void tearDown() throws Exception {
        driver.quit ();
    }
}