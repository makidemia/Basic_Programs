package Amazon;

import java.util.Date;

public class Product{

    String price;
    String manufacturer;
    String dicountOffered;
    Date expirDate;
    String importer;
    boolean isImported;
    String warrentyPeriond;

    public Product(String price, String manufacturer, String dicountOffered, Date expirDate, String importer, boolean isImported, String warrentyPeriond) {
        this.price = price;
        this.manufacturer = manufacturer;
        this.dicountOffered = dicountOffered;
        this.expirDate = expirDate;
        this.importer = importer;
        this.isImported = isImported;
        this.warrentyPeriond = warrentyPeriond;
    }
}
