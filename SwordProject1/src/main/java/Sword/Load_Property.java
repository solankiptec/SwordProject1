package Sword;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Load_Property  {
    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key){
        prop = new Properties();
        try {
            input = new FileInputStream("C:\\Users\\Welcome\\IdeaProjects\\SwordProject1\\src\\Resources\\java\\Data\\Config.properties");
            prop.load(input);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
