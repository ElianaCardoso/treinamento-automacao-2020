package pageObjects;

import elementMapper.CartPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Browser;


public class CartPage extends CartPageElementMapper {

//    public static WebDriver driver;
//    public static WebDriverWait wait;

//    driver = new CartPage;
//    wait = new WebDriverWait(driver, 30);


    public CartPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getNameProductCart() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#cart_summary .product-name")));
        return nameProductCart.getText();
    }

//                  }
//        }
//        return CartPage;
//    }

}