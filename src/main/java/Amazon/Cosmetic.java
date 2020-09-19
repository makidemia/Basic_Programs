package Amazon;

import java.util.Date;

public class Cosmetic extends Product{

    String shade;
    String brand;
    boolean isVegan;
    boolean couldBeAllergice;

    public Cosmetic(String price, String manufacturer, String dicountOffered, Date expirDate, String importer, boolean isImported, String warrentyPeriond) {
        super(price, manufacturer, dicountOffered, expirDate, importer, isImported, warrentyPeriond);
    }

    public Cosmetic(String price, String manufacturer, String dicountOffered, Date expirDate, String importer, boolean isImported, String warrentyPeriond, String shade, String brand, boolean isVegan, boolean couldBeAllergice) {
        super(price, manufacturer, dicountOffered, expirDate, importer, isImported, warrentyPeriond);
        this.shade = shade;
        this.brand = brand;
        this.isVegan = isVegan;
        this.couldBeAllergice = couldBeAllergice;
    }
}
