package pageObjects;

import elementMapper.CategoryPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {
    public CategoryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public boolean isPageTShirts(){
        return getAutenticationPageTShirts().contains("T-SHIRTS");
    }

    public String getAutenticationPageTShirts(){
        return nameCategoryTShirts.getText();
    }

    public void clickProductAddToProductPage(){
        BasePage.mouseover(productNameCategory);
        buttonMoreAddToProductPage.click();
    }

    public String getProductNameCategory(){
        return productNameCategory.getText();
    }
}
