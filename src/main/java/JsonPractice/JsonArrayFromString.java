package JsonPractice;

import com.google.gson.*;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.*;

public class JsonArrayFromString {

    public static void main(String[] args) {

        String jsonS = "{\"name\":\"mayank\",\"college\":\"Mit\"}";
        JsonParser jsonParser = new JsonParser();

        JsonObject jsonObject = jsonParser.parse(jsonS).getAsJsonObject();
        System.out.println(jsonObject);

        //String ->jsonArr
        String jsonA="[\"Russian\",\"English\",\"French\"]";

        JsonParser jsonParser1=new JsonParser();
        JsonArray jsonArray=jsonParser1.parse(jsonA).getAsJsonArray();
        System.out.println(jsonArray);

        //String ->javaArray
        Gson gson=new Gson();
        ArrayList arr=gson.fromJson(jsonA, ArrayList.class);
        System.out.println(arr);


       //map ->json
        Map map=new HashMap();
        map.put("name","mk");
        map.put("comp","idemia");

        Gson gsonBuilder=new GsonBuilder().create();
        String jsonFromJavaMap=gsonBuilder.toJson(map);
        System.out.println(jsonFromJavaMap);

        //list->json
        List language=new LinkedList();
        language.add("spanish");
        language.add("french");
        language.add("eng");

        Gson gsonBuilder1=new GsonBuilder().create();
        String jsonFromjavaArray=gsonBuilder1.toJson(language);
        System.out.println(jsonFromjavaArray);

    }

}
