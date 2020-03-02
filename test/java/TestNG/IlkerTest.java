package TestNG;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IlkerTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("setUpClass() metodu çalıştı!");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.out.println("setUpMethod() metodu çalıştı!");
    }

    @Test
    public void test1(){

        System.out.println("Test1() Metodu Çalıştı");
    }

    @Test
    public void test2(){

        System.out.println("Test2() Metodu Çalıştı");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("tearDownMethod() metodu çalıştı!");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("tearDownClass() metodu çalıştı!");

//        setUpClass() ve tearDownClass() metotları bir kez,
//        setUpMethod() ve tearDownMethod() metotlarımız iki adet
//        @Test ile işaretli metodumuz olduğu için 2 defa çalıştılar.
    }
}
