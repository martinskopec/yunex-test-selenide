package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestConfig {

    public static Properties properties = new Properties();

    public static void getProperties() {
        FileInputStream input = null;
        try {
            input = new FileInputStream("src/main/resources/config.properties");
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
