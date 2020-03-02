package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MakaleIslemTest {
    Makale makale = new Makale();
    MakaleIslem makaleIslem = new MakaleIslem();

    @Test
    public void kelimeSayisiTest() {
        makale.setBaslik("Bugün okullar tatil");
        makale.setIcerik("Kar yağışından dolayı okullar tatil edildi.");

        int kelimeSayisi = makaleIslem.kelimeSayisi(makale);
        Assert.assertEquals(kelimeSayisi, 3);
    }
}