package br.com.stefanini.pages.identity;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.identity.ProfilesMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfilesPage {
    ProfilesMap profilesMap;
    public ProfilesPage(){
        profilesMap = new ProfilesMap();
        PageFactory.initElements(Driver.getDriver(), profilesMap);
    }

    public void clickProfiles(){
        profilesMap.linkProfiles.click();

    }
    public void selectProfile(String empresa){
        Select select = new Select(profilesMap.slcEmpresa);
        select.selectByVisibleText(empresa);

    }
    public ProfilesPage clickTipo(){
        profilesMap.slcTipo.click();
        return this;
    }
    public ProfilesPage clickBlotter(){
        profilesMap.optBlotter.click();
        return this;
    }
    public ProfilesPage clickIdentity(){
        profilesMap.optIdentity.click();
        return this;
    }
    public ProfilesPage setAddProfile(String addProfile){
        profilesMap.inpAddProfile.sendKeys(addProfile);
        return this;
    }
    public ProfilesPage clickExcluir(){
        profilesMap.btnExcluir.click();
        return this;
    }
    public ProfilesPage clickExcluirCancel(){
        profilesMap.btnExcluirCancel.click();
        return this;
    }
    public ProfilesPage clickYes(){
        profilesMap.btnYes.click();
        return this;
    }
    public ProfilesPage clickEditar(){
        profilesMap.btnEditar.click();
        return this;
    }
    public void setName(String name){
        profilesMap.inpName.sendKeys(name, Keys.ENTER);
    }
    public ProfilesPage setDescription(String description){
        profilesMap.inpDescription.sendKeys(description);
        return this;
    }
    public ProfilesPage clickArea(){
        profilesMap.slcArea.click();
        return this;
    }
    public ProfilesPage clickCancel(){
        profilesMap.btnCancel.click();
        return this;
    }
    public ProfilesPage clickSave(){
        profilesMap.btnSave.click();
        return this;
    }
    public String getMsg(){
        return profilesMap.textMsg.getText();
    }
}
