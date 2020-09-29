package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static  WebDriver getCurrentDriver(){
        if(driver == null){
//            try {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
                ChromeOptions capability = new ChromeOptions();
                capability.addArguments("--disable-dev-shm-usage");
                capability.addArguments("--no-sandbox");
//                capability.setExperimentalOption("useAutomationExtension", false);
//                capability.setPageLoadStrategy(PageLoadStrategy.NONE);

//                driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
                driver = new ChromeDriver(capability);
                wait = new WebDriverWait(driver, 30);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
 //           }
        }
        return driver;
    }

    public static void  close(){
        getCurrentDriver().quit();
        driver = null;
    }

    public static void loadPage(String url) {
        getCurrentDriver().get(url);
    }
}
