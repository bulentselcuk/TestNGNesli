package TestNG;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test5 {
    private WebDriver driver;

    @BeforeClass
    public void Startup(){

        driver = new ChromeDriver ();
    }


    @Test (description="Google Login")
    public void GoogleLogin() throws Exception{
        driver.get("http://www.gmail.com");
        assertEquals("Sign in", driver.findElement(By.id("signIn")).getAttribute("value"));
        driver.findElement(By.id("Email")).sendKeys("bulentselcuk@gmail.com");
        driver.findElement(By.id("Passwd")).sendKeys("Lakota1890Bulent67");
        driver.findElement(By.id("signIn")).click();
        Thread.sleep(10000);
//        driver.switchTo().frame("canvas_frame");
//        driver.findElement(By.id("gbgs4dn")).click();
//        driver.findElement(By.id("gb_71")).click();
//        driver.switchTo().defaultContent();
//        assertEquals("Sign in to Gmail", driver.findElement(By.id("button")).getText());
    }
    @AfterClass
    public void teardown(){
       driver.quit();
    }
}