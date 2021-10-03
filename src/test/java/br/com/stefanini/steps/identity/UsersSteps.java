package br.com.stefanini.steps.identity;

import br.com.stefanini.pages.identity.UsersPage;
import br.com.stefanini.utils.TrataCampos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class UsersSteps {
    UsersPage usersPage;
    @Dado("que esteja na pagina de usuarios com a empresa {string}")
    public void queEstejaNaPaginaDeUsuariosComAEmpresa(String empresa) {
        usersPage = new UsersPage();

        usersPage.clickUsers();
        usersPage.selectEmpresa(empresa);
    }


    @Quando("realizo um cadastro de uma novo usuario com os dados")
    public void realizoUmCadastroDeUmaNovoUsuarioComOsDados(Map<String, String> map) {
        usersPage.clickAdd()
                .setUser(TrataCampos.trataCampo(map.get("name")))
                .setEmail(TrataCampos.trataCampo(map.get("email")))
                .clickContinue()
                .clickApplication()
                .clickSelectAll()
                .clickApplication()
                .clickContinue()
                .clickSelectProfile()
                .clickProfile(map.get("profile"))
                .clickContinue()
                .clickSave();


    }

    @Entao("usuario cadastrado com sucesso")
    public void usuarioCadastradoComSucesso() {
        Assert.assertEquals("User saved successfully", usersPage.getMsg());
    }


}
