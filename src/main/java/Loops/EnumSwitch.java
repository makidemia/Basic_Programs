package Loops;

public class EnumSwitch {

    enum Fruits {
        ORANGE("orange"),
        MANGO("mango"),
        APPLE("apple"),
        BANNANA("bannana");

        String fruit;

        Fruits(String fruit) {
            this.fruit = fruit;
        }
    }
    enum Weather {
        Sunny("s"), Cloudy("c");


        String  weather;
        Weather(String weather){
            this.weather=weather;
        }
        @Override
        public String toString() {
            return "WEATHER." + super.toString().toUpperCase();
        }
    }


    public void selectFruit(Fruits fruits) {
        switch (fruits) {

             case MANGO:
                System.out.println("yello");
                break;
            case ORANGE:
                System.out.println("orange");
                break;
            case BANNANA:
                System.out.println("yellow");
            default:
                System.out.println("fruit not availale");
        }
    }


    public static void main(String[] args) {
        EnumSwitch swichInEnum=new EnumSwitch();
        swichInEnum.selectFruit(Fruits.APPLE);

        Weather we=Weather.Cloudy;
        System.out.println(we);

    }


}
