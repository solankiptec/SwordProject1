package Sword;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage{
    public static void clickElement(By by){
        driver.findElement(by).click();
    }
    public static void enterText(By by, String text){
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }

    public static String get_text(By by){
        return
                driver.findElement(by).getText();
    }
    public static void selectByVisibleText(By by,String text){
        new Select(driver.findElement(by)).selectByVisibleText(text);
    }
    public static void selectByIndex(By by,int number){
        new Select(driver.findElement(by)).selectByIndex(number);

    }
    public static void selectByValue(By by,String value){
        Select select=new Select(driver.findElement(by));
        select.selectByValue(value);
    }
}
