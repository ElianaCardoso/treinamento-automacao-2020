package pageObjects;

import elementMapper.FormularioCadastroElementMapper;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.Browser;

public class FormularioCadastroPage extends FormularioCadastroElementMapper {

    public FormularioCadastroPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBtnLogin() {
        login.click();
    }

    public void clickEmail_create() {
        email_create.click();
    }

    public void sendKeysEmail_create(String Keys) {
        email_create.sendKeys(Keys);
    }

    public void clickBtnCreate_an_account() {
        btnCreate_an_account.click();
    }

    public void clickRadioIdGender2() {
        radioIdGender2.click();
    }

    public void clickFirstName1() {
        firstName1.click();
    }

    public void sendKeysFirstName1(String Keys) {
        firstName1.sendKeys(Keys);
    }

    public void clickLastName1() {
        lastName1.click();
    }

    public void sendKeysLastName1(String Keys) {
        lastName1.sendKeys(Keys);
    }

    public void clickEmail() {
        email.click();
    }

    public void clickPassword() {
        password.click();
    }

    public void sendKeysPassword(String Keys) {
        password.sendKeys(Keys);
    }

    public void clickDays(String value) {
        Select daysSelect = new Select(days);
        daysSelect.selectByValue(value);
    }

    public void clickMonths(String value) {
        Select monthsSelect = new Select(months);
        monthsSelect.selectByValue(value);
    }

    public void clickYears(String value) {
        Select yearsSelected = new Select(years);
        yearsSelected.selectByValue(value);
    }
    public void clickCkboxNewsletter() {
        ckboxNesletter.click();
    }

    public void clickCkboxOptin() {
        ckboxOptin.click();
    }

    public void clickCompania() {
        compania.click();
    }

    public void sendKeysCompania(String Keys) {
        compania.sendKeys(Keys);
    }

    public void clickAddress1() {
        address1.click();
    }

    public void sendKeysAddress1(String Keys) {
        address1.sendKeys(Keys);
    }

    public void clickAddress2() {
        address2.click();
    }

    public void sendKeysAddress2(String Keys) {
        address2.sendKeys(Keys);
    }

    public void clickCity() {
        city.click();
    }

    public void sendKeysCity(String Keys) {
        city.sendKeys(Keys);
    }

    public void clickState(String value) {
        Select stateSelected = new Select(state);
        stateSelected.selectByValue(value);
    }

    public void clickCEP() {
        CEP.click();
    }

    public void sendKeysCEP(String Keys) {
        CEP.sendKeys(Keys);
    }

    public void clickCountry(String value) {
        Select countrySelected = new Select(country);
        countrySelected.selectByValue(value);
    }

    public void clickAddInformation() {
        addInformation.click();
    }

    public void sendKeysAddInformation(String Keys) {
        addInformation.sendKeys(Keys);
    }

    public void clickHomePhone() {
        homephone.click();
    }

    public void sendKeysHomePhone(String Keys) {
        homephone.sendKeys(Keys);
    }

    public void clickPhoneMobile() {
        phoneMobile.click();
    }

    public void sendKeysPhoneMobile(String Keys) {
        phoneMobile.sendKeys(Keys);
    }

    public void clickAlias() {
        alias.click();
    }

    public void sendKeysAlias(String Keys) {
        alias.sendKeys(Keys);
    }
}
