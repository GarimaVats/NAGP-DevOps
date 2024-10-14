package config;

import logger.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Config {
    public static final String BASE_URL = "https://www.redbus.in/";

    public Properties initializeConfig() {
        Properties conf = new Properties();
        try {
            FileInputStream input = new FileInputStream("src/test/resources/config.properties");
            conf.load(input);
        } catch (IOException e) {
            e.printStackTrace();
            Log.warn(e.getMessage());
        }
        return conf;
    }

}
