package TestNG;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
        import org.testng.annotations.AfterTest;
        import org.testng.annotations.BeforeTest;
        import org.testng.annotations.Test;

public class firstTest  {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty ( "webdriver.chrome.driver", "resources/chromedriver" );
        driver=new ChromeDriver ();
    }

    @Test
    public void titleControl() {
        driver.get("http://www.google.com");
        Assert.assertEquals ( driver.getTitle (),"Google" );
    }

    @AfterTest
    public void teardown(){

        driver.quit();
    }
}