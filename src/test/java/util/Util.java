package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Util {

    public String readProperties(String key) {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("user.dir" + "/config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();
            return properties.getProperty(key);
        } catch (Exception e) {
            System.out.println("Util.readProperties: Se ha producido un error al leer el config properties");
            /// TODO: 21/04/2024 Falta hacer el log a este error
            return null;
        }
    }
}
