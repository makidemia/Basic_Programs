package Amazon;

import java.util.Date;

public class Electronics extends Product{

    String type;
    String productname;
    boolean isWaterProof;
    String powerConsumption;
    String energySavingRating;

    public Electronics(String price, String manufacturer, String dicountOffered, Date expirDate, String importer, boolean isImported, String warrentyPeriond) {
        super(price, manufacturer, dicountOffered, expirDate, importer, isImported, warrentyPeriond);
    }

    public Electronics(String price, String manufacturer, String dicountOffered, Date expirDate, String importer, boolean isImported, String warrentyPeriond, String type, String productname, boolean isWaterProof, String powerConsumption, String energySavingRating) {
        super(price, manufacturer, dicountOffered, expirDate, importer, isImported, warrentyPeriond);
        this.type = type;
        this.isWaterProof = isWaterProof;
        this.powerConsumption = powerConsumption;
        this.energySavingRating = energySavingRating;
        this.productname=productname;
    }

        public String getType() {
        return type;
    }

    public boolean isWaterProof() {
        return isWaterProof;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public String getEnergySavingRating() {
        return energySavingRating;
    }
}
