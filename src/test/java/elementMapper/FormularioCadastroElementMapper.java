package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.HomePage;

public class FormularioCadastroElementMapper extends HomePage {

    @FindBy(id = "email_create")
    public WebElement email_create;

    @FindBy(css = "#SubmitCreate")
    public WebElement btnCreate_an_account;

    @FindBy (id = "uniform-id_gender2")
    public WebElement radioIdGender2;

    @FindBy (id = "customer_firstname")
    public WebElement firstName1;

    @FindBy (id = "customer_lastname")
    public WebElement lastName1;

    @FindBy (css = "#email")
    public WebElement email;

    @FindBy (css = "#passwd")
    public WebElement password;

    @FindBy (id = "days")
    public WebElement days;

    @FindBy (id = "months")
    public WebElement months;

    @FindBy (id = "years")
    public WebElement years;

    @FindBy (id = "newsletter")
    public WebElement ckboxNesletter;

    @FindBy (id = "optin")
    public WebElement ckboxOptin;

    @FindBy (id = "company")
    public WebElement compania;

    @FindBy (id = "address1")
    public WebElement address1;

    @FindBy (id = "address2")
    public WebElement address2;

    @FindBy (id = "city")
    public WebElement city;

    @FindBy (id = "id_state")
    public WebElement state;

    @FindBy (id = "postcode")
    public WebElement CEP;

    @FindBy (id = "id_country")
    public WebElement country;

    @FindBy (id = "other")
    public WebElement addInformation;

    @FindBy (id = "phone")
    public WebElement homephone;

    @FindBy (id = "phone_mobile")
    public WebElement phoneMobile;

    @FindBy (id = "alias")
    public WebElement alias;

    @FindBy (id = "center_column")
    public WebElement alert;
}
