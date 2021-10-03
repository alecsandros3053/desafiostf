package br.com.stefanini.steps.identity;

import br.com.stefanini.pages.identity.ProfilesPage;
import br.com.stefanini.utils.TrataCampos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

import java.util.Map;

public class ProfilesSteps {
    ProfilesPage profilesPage;

    @Dado("que esteja na pagina de profile")
    public void queEstejaNaPaginaDeProfile() {
        profilesPage = new ProfilesPage();
        profilesPage.clickProfiles();


    }

    @Quando("altero a empresa para {string}")
    public void alteroAEmpresaPara(String empresa) {
        profilesPage.selectProfile(empresa);
    }

    @E("cadastro um novo profile com os dados")
    public void cadastroUmNovoProfileComOsDados(Map<String, String> map) {
        profilesPage.clickTipo();
        if (map.get("sistema").equals("Identity")){
            profilesPage.clickIdentity();
        }else{
            profilesPage.clickBlotter();
        }
        profilesPage.setName(TrataCampos.trataCampo(map.get("profile")));
    }


}
