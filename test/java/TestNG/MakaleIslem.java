package TestNG;

public class MakaleIslem {

    public int kelimeSayisi(Makale makale) {
        return makale.getBaslik ().split(" ").length;
    }

}