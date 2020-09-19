package enumprac;

public class EnumTry {

    ExpectedPropertyKeys enumObj;

    enum Weather {
        Sunny, Cloudy;

        @Override
        public String toString() {
            return "WEATHER." + super.toString().toUpperCase();
        }
    }

    private static enum ExpectedPropertyKeys {
        TYPE("device.type", "phone"),
        MODEL("dev.model", "S6"),
        LOCALE("locale", "EN");

        String value;
        String key;

        ExpectedPropertyKeys(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private enum PresentationProperty {
        MODE("mode", "NFC");

        String key;
        String value;

        PresentationProperty(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void pickOneEnum(PresentationProperty presentationEnum){
        PresentationProperty.values();

    }

    public static void main(String[] args) {
    //enum can only be called with the help of its constants
        PresentationProperty pp = PresentationProperty.MODE;
        System.out.println(pp.key+" "+pp.value);
    }
}




