package Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader
{
    public static String readProperty(String key) throws IOException
    {
        FileReader fileReader= new FileReader(
                "C:\\Testing\\WebDriver-Task-Hurt-Me-Planty-Level-main\\src\\test\\resources\\qa.properties");
        Properties properties= new Properties();
        properties.load(fileReader);
        return properties.getProperty(key);
    }
}

