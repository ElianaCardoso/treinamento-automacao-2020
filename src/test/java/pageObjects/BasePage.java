package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Browser;

public class BasePage extends Browser {

    public static void click(WebElement element){
        element.click();
    }

    public static void mouseover(WebElement element){
        Actions action = new Actions(getCurrentDriver());
        action.moveToElement(element).build().perform();
    }
}
