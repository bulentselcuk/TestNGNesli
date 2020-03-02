package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MakaleTest {
    Makale makale = new Makale();

    @Test
    public void makaleTest() {
        makale.setBaslik("Bugün okullar tatil");
        makale.setIcerik("Kar yağışından dolayı okullar tatil edildi.");

        Assert.assertEquals(makale.getBaslik(), "Bugün okullar tatil");
        Assert.assertEquals(makale.getIcerik(), "Kar yağışından dolayı okullar tatil edildi.");
    }
}