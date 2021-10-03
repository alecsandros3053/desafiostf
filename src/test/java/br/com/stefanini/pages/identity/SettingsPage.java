package br.com.stefanini.pages.identity;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.identity.SettingsMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SettingsPage {
    SettingsMap settingsMap;
    public SettingsPage(){
        settingsMap = new SettingsMap();
        PageFactory.initElements(Driver.getDriver(), settingsMap);
    }
    public void selectEmpresa(String empresa){
        Select select = new Select(settingsMap.slcEmpresa);
        select.selectByVisibleText(empresa);
    }

    public void clickSettings(){
        settingsMap.linkSettings.click();
    }


    public SettingsPage setBlockUsersAfter(String blockUsersAfter){
        settingsMap.inpBlockUsersAfter.clear();
        settingsMap.inpBlockUsersAfter.sendKeys(blockUsersAfter);
        return this;
    }
    public SettingsPage setReuseTheLast(String reuseTheLast){
        settingsMap.inpReuseTheLast.clear();
        settingsMap.inpReuseTheLast.sendKeys(reuseTheLast);
        return this;
    }
    public SettingsPage setExpirePassword(String expirePassword){
        settingsMap.inpExpirePassword.clear();
        settingsMap.inpExpirePassword.sendKeys(expirePassword);
        return this;
    }
    public SettingsPage setExpireSession(String expireSession){
        settingsMap.inpExpireSession.clear();
        settingsMap.inpExpireSession.sendKeys(expireSession);
        return this;
    }
    public SettingsPage setExpireInvitation(String expireInvitation){
        settingsMap.inpExpireInvitation.clear();
        settingsMap.inpExpireInvitation.sendKeys(expireInvitation);
        return this;
    }
    public SettingsPage setPasswordMustHave(String passwordMustHave){
        settingsMap.inpPasswordMustHave.clear();
        settingsMap.inpPasswordMustHave.sendKeys(passwordMustHave);
        return this;
    }
    public void clickSave(){
        settingsMap.btnSave.click();
    }
    public String getMsg(){
        Driver.visibilityOf(settingsMap.textMsg);
        return settingsMap.textMsg.getText();
    }
}
