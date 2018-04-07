package Sword;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    Load_Property load_property=new Load_Property();
    String url=load_property.getProperty("url");
    public void getUrl() {
        driver.get(url);
    }
    public void serchProduct(String search){
        Utils.enterText(By.id("s"),search);
        Utils.clickElement(By.id("searchsubmit"));
        }
}
