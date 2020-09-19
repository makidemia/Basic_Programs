package JsonPractice;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonPractice {
    public static void main(String[] args) {


        JsonObject person=new JsonObject();
        person.addProperty("name","mk");
        person.addProperty("company","idemia");

        System.out.println(person.toString());


        JsonObject address=new JsonObject();
        address.addProperty("address","rtm");
        address.addProperty("currentAddress","pune");

        person.add("addressOfEmp",address);
        System.out.println(address.toString());


        JsonArray lang=new JsonArray();
        lang.add("hindi");
        lang.add("eng");
        System.out.println(lang);
        person.add("languageOfEmp",lang);

        System.out.println(person);



    }
}
