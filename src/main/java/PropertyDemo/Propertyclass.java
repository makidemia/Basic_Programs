package PropertyDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Propertyclass {

    public static void main(String[] args) {


        Properties p = new Properties();
        try {
            OutputStream os = new FileOutputStream("file.properties");
            p.setProperty("username","uname");
            p.setProperty("password","password");
            p.store(os,"property file");

            InputStream is=new FileInputStream("file.properties");
            p.load(is);
            System.out.println(p.getProperty("username"));

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
