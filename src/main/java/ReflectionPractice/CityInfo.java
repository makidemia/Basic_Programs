package ReflectionPractice;

import java.lang.annotation.Annotation;

public class CityInfo implements AnnotationInterface {

    String cityName;
    int zip;
    String streetName;
    String apartment;
    int houseNo;

    public String toString() {
        return cityName + " " + zip + " " + streetName + " " + apartment + " " + houseNo;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }

    public CityInfo(){ //default
    }

    public CityInfo(String cityName, int zip, String streetName, String apartment, int houseNo) {
        this.cityName = cityName;
        this.zip = zip;
        this.streetName = streetName;
        this.apartment = apartment;
        this.houseNo = houseNo;
    }

    public static void main(String[] args) {
        CityInfo cityInfo = new CityInfo("Pune", 2233, "magarpatta", "Daffodils", 550);

    }

    @Override
    public  String annotate(){
        return "annoted inherited method ";
    }
}
