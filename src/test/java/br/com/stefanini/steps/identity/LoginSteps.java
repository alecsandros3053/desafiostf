package br.com.stefanini.steps.identity;

import br.com.stefanini.core.Driver;
import br.com.stefanini.enums.Browser;
import br.com.stefanini.pages.identity.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import org.junit.Assert;


public class LoginSteps {
    LoginPage loginPage;

    @Before
    public void inicializaDriver(){
        new Driver(Browser.CHROME);
    }

    @After
    public  void finalizaDriver(){
        Driver.getDriver().quit();
    }

    @Dado("que esteja na pagina {string}")
    public void queEstejaNaPagina(String url) {

        Driver.getDriver().get(url);
        loginPage = new LoginPage();
    }
    @Quando("realizo login com dados validos")
    public void realizoLoginComDadosValidos() {
        loginPage.setUserName("Eraldo Junior")
                .setUserEmail("juniorcosta@email.com")
                .setPassword("Senha123")
                .clickLogin();
    }
    @Entao("a pagina inicial exibe com sucesso")
    public void aPaginaInicialExibeComSucesso() {
        Assert.assertEquals("Usuários cadastrados", loginPage.getHome());
    }

    @Dado("que tenha realizado login com dados validos")
    public void queTenhaRealizadoLoginComDadosValidos() {
        queEstejaNaPagina("http://prova.stefanini-jgr.com.br/teste/qa/");
        realizoLoginComDadosValidos();
        aPaginaInicialExibeComSucesso();
    }
}
