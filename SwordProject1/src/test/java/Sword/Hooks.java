package Sword;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils{

    Browser_Factory browser_factory =new Browser_Factory();
    Load_Property load_property = new Load_Property();
    String url = load_property.getProperty("url");
    String browser = load_property.getProperty("Browser");
    HomePage homePage=new HomePage();


    @Before

    public void set_up_Browser() {
        browser_factory.selectBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
