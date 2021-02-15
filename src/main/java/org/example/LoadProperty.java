package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty
{
    static Properties prop;
    static FileInputStream input;
    static String fileName = "TestDataConfig.Properties";
    static String fileLocation = "src\\test\\resources\\TestData\\";

    public String getProperty (String key)
    {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation + fileName);
            prop.load(input);
            input.close();

        } catch (IOException e)
        {
            e.printStackTrace();
        }return prop.getProperty(key);
    }
}

