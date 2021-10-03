package br.com.stefanini.steps.front;

import br.com.stefanini.core.Driver;
import br.com.stefanini.pages.front.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage;
    @Dado("que esteja na pagina front {string}")
    public void queEstejaNaPaginaFront(String url) {
        Driver.getDriver().get(url);
        loginPage = new LoginPage();
    }


    @Quando("realizo login de front com dados validos")
    public void realizoLoginDeFrontComDadosValidos() {
        loginPage.setEmail("vvannuchi@britech.global")
                .setPassword("Blotter@123")
                .clickLogin();
    }


    @Entao("a pagina inicial de front exibe com sucesso")
    public void aPaginaInicialDeFrontExibeComSucesso() {
        Assert.assertEquals("GERAL", loginPage.getPrincipal());
    }

    @Dado("que tenha realizado login de front com dados validos")
    public void queTenhaRealizadoLoginDeFrontComDadosValidos() {

        queEstejaNaPaginaFront("https://qa-hm.britech.com.br/BLOTTER_FRONT");
        realizoLoginDeFrontComDadosValidos();
        aPaginaInicialDeFrontExibeComSucesso();
    }
}
