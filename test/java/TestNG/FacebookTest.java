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

public class FacebookTest {

    private WebDriver driver;
    public static String loginUrl = "https://facebook.com/";

    @BeforeTest
    public void setUp() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver(capabilities);
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();

    }
    @Test
    public void facebook() {
        driver.get(loginUrl);
        driver.findElement ( By.id("email") ).sendKeys("bulentselcuk@gmail.com");
        driver.findElement ( By.id("pass") ).sendKeys("Lakota1890Bulent67");
        driver.findElement ( By.id ("u_0_b")).click ();

    }
    @AfterTest
    public void tearDown() throws Exception {
        driver.quit ();
    }
}