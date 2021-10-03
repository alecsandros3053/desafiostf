package br.com.stefanini.steps.identity;

import br.com.stefanini.pages.identity.CompaniesPage;
import br.com.stefanini.utils.TrataCampos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class CompaniesSteps {
    CompaniesPage companiesPage;
    @Dado("que esteja na pagina companies")
    public void queEstejaNaPaginaCompanies() {
        companiesPage = new CompaniesPage();
    }


    @Quando("realizo um cadastro de uma nova empresa com os dados")
    public void realizoUmCadastroDeUmaNovaEmpresaComOsDados(Map<String, String> map) {
        companiesPage.clickAdd()
                .setName(TrataCampos.trataCampo(map.get("name")))
                .selectType(map.get("type"))
                .clickSave();
    }

    @Entao("o cadastro foi realizado")
    public void oCadastroFoiRealizado() {
        Assert.assertEquals("Company saved successfully", companiesPage.getMessagem());
    }
}
