package br.com.stefanini.pages.identity;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.identity.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;
    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public LoginPage setUserName(String userName){
        Driver.visibilityOf(loginMap.inpUserName);
        loginMap.inpUserName.sendKeys(userName);
        return this;
    }

    public LoginPage setUserEmail(String userEmail){
        Driver.visibilityOf(loginMap.inpUserEmail);
        loginMap.inpUserEmail.sendKeys(userEmail);
        return this;
    }

    public LoginPage setPassword(String password){
        loginMap.inpPassword.sendKeys(password);
        return this;
    }
    public LoginPage clickLogin(){
        loginMap.btnLogin.click();
        return this;
    }

    public String getHome(){
        Driver.visibilityOf(loginMap.textHome);
        return loginMap.textHome.getText();
    }

}
