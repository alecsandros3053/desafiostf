package br.com.stefanini.steps.identity;

import br.com.stefanini.pages.identity.SettingsPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class SettingsSteps {
    SettingsPage settingsPage;

    @Dado("que esteja na pagina de settings com a empresa {string}")
    public void queEstejaNaPaginaDeSettingsComAEmpresa(String empresa) {
        settingsPage = new SettingsPage();
        settingsPage.clickSettings();
        settingsPage.selectEmpresa(empresa);
    }

    @Quando("realizo a alteracao dos dados por")
    public void realizoAAlteracaoDosDadosPor(Map<String, String> map) {
        settingsPage.setBlockUsersAfter(map.get("blockUsers"))
                .setReuseTheLast(map.get("dontReuse"))
                .setExpirePassword(map.get("expirePass"))
                .setExpireSession(map.get("expireSession"))
                .setExpireInvitation(map.get("expireEvitation"))
                .setPasswordMustHave(map.get("passMustHave"))
                .clickSave();
    }

    @Entao("dados de settings sao alterados")
    public void dadosDeSettingsSaoAlterados() {
        Assert.assertEquals("Settings saved successfully", settingsPage.getMsg());
    }
}
