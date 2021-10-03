package br.com.stefanini.pages.identity;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.identity.UsersMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UsersPage {
    UsersMap usersMap;

    public UsersPage() {
        usersMap = new UsersMap();
        PageFactory.initElements(Driver.getDriver(), usersMap);
    }

    public void selectEmpresa(String empresa){
        Select select = new Select(usersMap.slcEmpresa);
        select.selectByVisibleText(empresa);

    }


    public void clickUsers(){
        usersMap.linkUsers.click();
    }

    public UsersPage clickAdd() {
        Driver.waitExplicit(1000);
        Driver.visibilityOf(usersMap.btnAdd);
        usersMap.btnAdd.click();
        return this;
    }

    public UsersPage setUser(String user) {
        Driver.visibilityOf(usersMap.inpUser);
        usersMap.inpUser.sendKeys(user);
        return this;
    }

    public UsersPage setEmail(String email) {
        usersMap.inpEmail.sendKeys(email);
        return this;
    }

    public UsersPage clickContinue() {
        usersMap.btnContinue.click();
        return this;
    }

    public UsersPage clickCancel() {
        usersMap.btnCancel.click();
        return this;
    }

    public UsersPage clickApplication() {
        Driver.visibilityOf(usersMap.btnApplication);
        usersMap.btnApplication.click();
        return this;
    }

    public UsersPage clickSelectAll() {
        usersMap.btnSelectAll.click();
        return this;
    }

    public UsersPage clickDeselectAll() {
        usersMap.btnDeselectAll.click();
        return this;
    }

    public UsersPage clickBackApplications() {
        usersMap.btnBackApplications.click();
        return this;
    }

    public UsersPage clickSelectProfile() {
        Driver.visibilityOf(usersMap.btnSelectProfile);
        usersMap.btnSelectProfile.click();
        return this;
    }

    public UsersPage clickProfile(String option) {
        usersMap.optProfile(option).click();
        return this;
    }

    public void clickSave() {
        Driver.visibilityOf(usersMap.btnSave);
        usersMap.btnSave.click();
    }

    public String getMsg() {
        Driver.visibilityOf(usersMap.textMsg);
        return usersMap.textMsg.getText();
    }
}
