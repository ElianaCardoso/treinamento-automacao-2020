package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroPageElementMapper extends FormularioCadastroElementMapper{


    @FindBy (id = "submitAccount")
    public WebElement btnSubmitAccount;


}
