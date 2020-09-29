package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

public class CartPageElementMapper extends BasePage {

    @FindBy(css = "#cart_summary .product-name")
    public WebElement nameProductCart;
}
