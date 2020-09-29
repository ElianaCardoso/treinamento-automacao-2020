package testes;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests {

    @Test
    public void testOpeningBrowserAndLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url!");
    }

    @Test
    public void testSearch() {

        String quest = "DRESS";
        String questResultQtd = "7";

        //Iniciar páginas
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();

        //Verificar que é possível realizar pesquisa
        home.clickSearch_query_top();
        System.out.println("Clicamos no botão Search.");

        home.sendKeysSearch_query_top("DRESS");
        System.out.println("Pesquisamos por Dress.");

        home.clickSubmit_search();
        System.out.println("Clicamos no botão Submit Search.");

        //Validar Pesquisa
        Assert.assertTrue(search.isSearchPage());
        Assert.assertEquals(search.getTextLighter().replace("\"", ""), quest);
        assertThat(search.getTextHeading_counter(), CoreMatchers.containsString(questResultQtd));

    }

    @Test
    public void testLogin() {

        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        MyAccountPage myAccount = new MyAccountPage();

        //Verificar se é possível realizar Login
        home.clickBtnLogin();
        System.out.println("Clicamos no botão Fazer Login.");

        login.sendKeysEmail("elianamagnus@hotmail.com");
        System.out.println("Inserimos o email.");

        login.sendKeysPasswd("Ab102030");
        System.out.println("Inserimos a senha.");

        login.clickSubmitLogin();
        System.out.println("Clicamos no botão Sign In.");

    }

    @Test
    public void testAcessCategoryTShirts() {
        //Iniciar as páginas
        HomePage home = new HomePage();
        CategoryPage category = new CategoryPage();

        //Clicar na categoria T-SHIRTS
        home.clickCategoryTShirts();
        //Browser.getCurrentDriver().findElement(By.linkText("T-SHIRTS")).click();

        //Validar se ao clicar na categoria T-SHIRTS, ocorre o direcionamento correto
        assertTrue(category.isPageTShirts());
    }

    @Test
    public void testAddProductToProductPage() {
        //Acessar a categoria T-Shirts
        testAcessCategoryTShirts();

        //Iniciar as páginas
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();

        //Salva o nome do produto na página da categoria.
        String nameProductCategory = category.getProductNameCategory();

        //Clicar no botão More e direcionar para a página de produto.
        category.clickProductAddToProductPage();

        //Verificar se o produto está na página de detalhes do produto corretamente
        assertTrue(pdp.getProductNamePDP().equals(nameProductCategory));
    }

    @Test
    public void testAddProductToCarPage() {

        //Acessar a página de produto
        testAddProductToProductPage();

        //Iniciar as páginas
        ProductPage pdp = new ProductPage();
        CartPage cart = new CartPage();

        //Salvar o nome do produto na página do PDP
        String nameProductPDP = pdp.getProductNamePDP();

        //Clicar no botão de Adicionar ao carrinho.
        pdp.clickbuttonAddToCart();

        //Clicar no botão Proceed To Checkout do modal.
        pdp.clickButtonModalProceedToCheckout();

        //Validação do nome do produto no carrinho.
        assertTrue(cart.getNameProductCart().equals(nameProductPDP));

    }

    @Test
    public void testPreencherFormularioCadastro() {
        //Iniciar as páginas.
        FormularioCadastroPage formulario = new FormularioCadastroPage();

        //Clicar no botão Sign In da Home.
        formulario.clickBtnLogin();
        System.out.println("Clicamos no botão Sign in.");

        //Preencher página Authentication > Create an Account.
        formulario.clickEmail_create();
        System.out.println("Clicamos o email.");

        formulario.sendKeysEmail_create("testeformulario@teste.com");
        System.out.println("Inserimos o email.");

        formulario.clickBtnCreate_an_account();
        System.out.println("Clicamos no botão Creat an account.");


        //Preencher página
        formulario.clickRadioIdGender2();
        System.out.println("Selecionamos radiobutton Mrs.");

        formulario.clickFirstName1();
        System.out.println("Clicamos no campo First Name");

        formulario.sendKeysFirstName1("Eliana");
        System.out.println("Inserimos o primeiro nome.");

        formulario.clickLastName1();
        System.out.println("Clicamos no campo Last Name");

        formulario.sendKeysLastName1("Teste Cadastro");
        System.out.println("Inserimos o Sobrenome.");

        formulario.clickEmail();
        System.out.println("Clicamos no campo Email.");

        formulario.clickPassword();
        System.out.println("Clicamos no campo Passwd.");

        formulario.sendKeysPassword("Ab102030");
        System.out.println("Inserimos a senha.");

        formulario.clickDays("21");
        System.out.println("Inserimos o dia.");

        formulario.clickMonths("3");
        System.out.println("Inserimos o mês.");

        formulario.clickYears("2000");
        System.out.println("Inserimos o ano.");

        formulario.clickCkboxNewsletter();
        System.out.println("Clicamos no checkbox Newsletter");

        formulario.clickCkboxOptin();
        System.out.println("Clicamos no checkbox Options");

        formulario.clickCompania();
        System.out.println("Clicamos no campo Company");

        formulario.sendKeysCompania("CWI");
        System.out.println("Inserimos nome da Compania");

        formulario.clickAddress1();
        System.out.println("Clicamos no campo Address.");

        formulario.sendKeysAddress1("Teste");
        System.out.println("Inserimos o endereço da Compania.");

        formulario.clickAddress2();
        System.out.println("Clicamos no campo Address2.");

        formulario.sendKeysAddress2("Teste");
        System.out.println("Inserimos o endereço da Compania Linha 2.");

        formulario.clickCity();
        System.out.println("Clicamos no campo City");

        formulario.sendKeysCity("Porto Alegre");
        System.out.println("Inserimos a cidade.");


        formulario.clickState("5");
        System.out.println("Inserimos o Estado.");

        formulario.clickCEP();
        System.out.println("Clicamos no campo CEP");

        formulario.sendKeysCEP("94027");
        System.out.println("Inserimos um cep.");

        formulario.clickCountry("21");
        System.out.println("Inserimos o País.");

        formulario.clickAddInformation();
        System.out.println("Clicamos no campo Additional Information");

        formulario.sendKeysAddInformation("Teste CWI");
        System.out.println("Inserimos informações adicionais.");

        formulario.clickHomePhone();
        System.out.println("Clicamos no campo Phone");

        formulario.sendKeysHomePhone("1234567890");
        System.out.println("Inserimos home phone.");

        formulario.clickPhoneMobile();
        System.out.println("Clicamos no campo Mobile Phone");

        formulario.sendKeysPhoneMobile("51 9 9999 9999");
        System.out.println("Inserimos Mobile Phone.");

        formulario.clickAlias();
        System.out.println("Clicamos no campo Alias");

        formulario.sendKeysAlias("Eliana Cardoso");
        System.out.println("Inserimos informações no campo Alias.");

        //Validar que ao preencher email e clicar no botão 'Create an account', sistema direciona para formulário de cadastro.
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains("my-account#account-creation"));
        System.out.println("Ao preencher email e clicar no botão 'Create an account', ocorreu o direcionamento para a página Minha Conta.");
    }

    @Test
    public void testPreencherCadastroCepInvalido() {

        //Iniciar as páginas.
        CadastroPage cadastro = new CadastroPage();
        MyAccountPage myAccount = new MyAccountPage();

        //Clicar no botão Sign In da Home.
        cadastro.clickBtnLogin();
        System.out.println("Clicamos no botão Sign in.");

        //Preencher página Authentication > Create an Account.
        cadastro.clickEmail_create();
        System.out.println("Clicamos o email.");

        cadastro.sendKeysEmail_create("testecepinvalido@teste.com");
        System.out.println("Inserimos o email.");

        cadastro.clickBtnCreate_an_account();
        System.out.println("Clicamos no botão Creat an account.");


        //Preencher página de cadastro
        cadastro.clickRadioIdGender2();
        System.out.println("Selecionamos radiobutton Mrs.");

        cadastro.clickFirstName1();
        System.out.println("Clicamos no campo First Name");

        cadastro.sendKeysFirstName1("Eliana");
        System.out.println("Inserimos o primeiro nome.");

        cadastro.clickLastName1();
        System.out.println("Clicamos no campo Last Name");

        cadastro.sendKeysLastName1("Teste Cadastro");
        System.out.println("Inserimos o Sobrenome.");

        cadastro.clickEmail();
        System.out.println("Clicamos no campo Email.");

        cadastro.clickPassword();
        System.out.println("Clicamos no campo Passwd.");

        cadastro.sendKeysPassword("Ab102030");
        System.out.println("Inserimos a senha.");

        cadastro.clickDays("21");
        System.out.println("Inserimos o dia.");

        cadastro.clickMonths("3");
        System.out.println("Inserimos o mês.");

        cadastro.clickYears("2000");
        System.out.println("Inserimos o ano.");

        cadastro.clickCkboxNewsletter();
        System.out.println("Clicamos no checkbox Newsletter");

        cadastro.clickCkboxOptin();
        System.out.println("Clicamos no checkbox Options");

        cadastro.clickCompania();
        System.out.println("Clicamos no campo Company");

        cadastro.sendKeysCompania("CWI");
        System.out.println("Inserimos nome da Compania");

        cadastro.clickAddress1();
        System.out.println("Clicamos no campo Address.");

        cadastro.sendKeysAddress1("Teste");
        System.out.println("Inserimos o endereço da Compania.");

        cadastro.clickAddress2();
        System.out.println("Clicamos no campo Address2.");

        cadastro.sendKeysAddress2("Teste");
        System.out.println("Inserimos o endereço da Compania Linha 2.");

        cadastro.clickCity();
        System.out.println("Clicamos no campo City");

        cadastro.sendKeysCity("Porto Alegre");
        System.out.println("Inserimos a cidade.");


        cadastro.clickState("5");
        System.out.println("Inserimos o Estado.");

        cadastro.clickCEP();
        System.out.println("Clicamos no campo CEP");

        cadastro.sendKeysCEP("1234567890");
        System.out.println("Inserimos um cep.");

        cadastro.clickCountry("21");
        System.out.println("Inserimos o País.");

        cadastro.clickAddInformation();
        System.out.println("Clicamos no campo Additional Information");

        cadastro.sendKeysAddInformation("Teste CWI");
        System.out.println("Inserimos informações adicionais.");

        cadastro.clickHomePhone();
        System.out.println("Clicamos no campo Phone");

        cadastro.sendKeysHomePhone("1234567890");
        System.out.println("Inserimos home phone.");

        cadastro.clickPhoneMobile();
        System.out.println("Clicamos no campo Mobile Phone");

        cadastro.sendKeysPhoneMobile("51 9 9999 9999");
        System.out.println("Inserimos Mobile Phone.");

        cadastro.clickAlias();
        System.out.println("Clicamos no campo Alias");

        cadastro.sendKeysAlias("Eliana Cardoso");
        System.out.println("Inserimos informações no campo Alias.");

        cadastro.clickBtnSubmitAccount();
        System.out.println("Clicamos no botão Register");

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        String alertCep = cadastro.getAlert();
        String esperado = "The Zip/Postal code you've entered is invalid. It must follow this format: 00000";
        System.out.println("Valor esperado: " + esperado);
        System.out.println("Valor da tela: " + alertCep);
        Assert.assertEquals(esperado, alertCep);
    }


    @Test
    public void testCadastrarUsuario() {

        //Iniciar as páginas.
        CadastroPage cadastro = new CadastroPage();
        MyAccountPage myAccount = new MyAccountPage();

        //Clicar no botão Sign In da Home.
        cadastro.clickBtnLogin();
        System.out.println("Clicamos no botão Sign in.");

        //Preencher página Authentication > Create an Account.
        cadastro.clickEmail_create();
        System.out.println("Clicamos o email.");

        cadastro.sendKeysEmail_create("testeeliana@teste.com");
        System.out.println("Inserimos o email.");

        cadastro.clickBtnCreate_an_account();
        System.out.println("Clicamos no botão Creat an account.");


        //Preencher página de cadastro
        cadastro.clickRadioIdGender2();
        System.out.println("Selecionamos radiobutton Mrs.");

        cadastro.clickFirstName1();
        System.out.println("Clicamos no campo First Name");

        cadastro.sendKeysFirstName1("Eliana");
        System.out.println("Inserimos o primeiro nome.");

        cadastro.clickLastName1();
        System.out.println("Clicamos no campo Last Name");

        cadastro.sendKeysLastName1("Teste Cadastro");
        System.out.println("Inserimos o Sobrenome.");

        cadastro.clickEmail();
        System.out.println("Clicamos no campo Email.");

        cadastro.clickPassword();
        System.out.println("Clicamos no campo Passwd.");

        cadastro.sendKeysPassword("Ab102030");
        System.out.println("Inserimos a senha.");

        cadastro.clickDays("21");
        System.out.println("Inserimos o dia.");

        cadastro.clickMonths("3");
        System.out.println("Inserimos o mês.");

        cadastro.clickYears("2000");
        System.out.println("Inserimos o ano.");

        cadastro.clickCkboxNewsletter();
        System.out.println("Clicamos no checkbox Newsletter");

        cadastro.clickCkboxOptin();
        System.out.println("Clicamos no checkbox Options");

        cadastro.clickCompania();
        System.out.println("Clicamos no campo Company");

        cadastro.sendKeysCompania("CWI");
        System.out.println("Inserimos nome da Compania");

        cadastro.clickAddress1();
        System.out.println("Clicamos no campo Address.");

        cadastro.sendKeysAddress1("Teste");
        System.out.println("Inserimos o endereço da Compania.");

        cadastro.clickAddress2();
        System.out.println("Clicamos no campo Address2.");

        cadastro.sendKeysAddress2("Teste");
        System.out.println("Inserimos o endereço da Compania Linha 2.");

        cadastro.clickCity();
        System.out.println("Clicamos no campo City");

        cadastro.sendKeysCity("Porto Alegre");
        System.out.println("Inserimos a cidade.");


        cadastro.clickState("5");
        System.out.println("Inserimos o Estado.");

        cadastro.clickCEP();
        System.out.println("Clicamos no campo CEP");

        cadastro.sendKeysCEP("94027");
        System.out.println("Inserimos um cep.");

        cadastro.clickCountry("21");
        System.out.println("Inserimos o País.");

        cadastro.clickAddInformation();
        System.out.println("Clicamos no campo Additional Information");

        cadastro.sendKeysAddInformation("Teste CWI");
        System.out.println("Inserimos informações adicionais.");

        cadastro.clickHomePhone();
        System.out.println("Clicamos no campo Phone");

        cadastro.sendKeysHomePhone("1234567890");
        System.out.println("Inserimos home phone.");

        cadastro.clickPhoneMobile();
        System.out.println("Clicamos no campo Mobile Phone");

        cadastro.sendKeysPhoneMobile("51 9 9999 9999");
        System.out.println("Inserimos Mobile Phone.");

        cadastro.clickAlias();
        System.out.println("Clicamos no campo Alias");

        cadastro.sendKeysAlias("Eliana Cardoso");
        System.out.println("Inserimos informações no campo Alias.");

        cadastro.clickBtnSubmitAccount();
        System.out.println("Clicamos no botão Register");

        //Verificar o direcionamento para a página de minha conta ao realizar o Cadastro.
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains("my-account"));
        System.out.println("Ao realizar cadastro, ocorreu o direcionamento para a página Minha Conta.");


        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou Minha Conta no site.");
    }
}

//Verificar se ao clicar no botão Login da Home ocorre o direcionamento para a página de Login.
//assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains("my-account"));
//login.clickSubmitLogin();
//System.out.println("Direcionamento para a página de login.");

//Realizar o login.
//login.doLogin();
//System.out.println("Realizamos o login.");

//Verificar o direcionamento para a página de minha conta ao realizar o login.
//assertTrue(myAccount.isPageMyAccount());
//System.out.println("Ao realizar login, ocorreu o direcionamento para a página de minha conta.");

//Browser.getCurrentDriver().findElement(By.className("login")).click();
//System.out.println("Clicou em Sign In e direcionou para a página de login.");
//assertTrue(Browser.getCurrentDriver().getCurrentUrl()
//      .contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

//Browser.getCurrentDriver().findElement(By.id("email")).sendKeys("elianamagnus@hotmail.com");
//System.out.println("Preencheu o email.");

//Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("Ab102030");
//System.out.println("Preencheu a senha.");

//Browser.getCurrentDriver().findElement(By.id("SubmitLogin")).click();
//System.out.println("Clicou em Sign In.");

//assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
//System.out.println("Validou a URL de minha conta.");

//assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
//System.out.println("Validou Minha Conta no site.");


