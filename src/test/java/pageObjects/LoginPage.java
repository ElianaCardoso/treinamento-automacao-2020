package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage() { PageFactory.initElements(Browser.getCurrentDriver(), this);}

        public void sendKeysEmail(String Keys) {
            email.sendKeys("elianamagnus@hotmail.com");
        }

        public void sendKeysPasswd(String Keys) {
            passwd.sendKeys("Ab102030");
        }

        public void clickSubmitLogin() {
            SubmitLogin.click();
    }


}
