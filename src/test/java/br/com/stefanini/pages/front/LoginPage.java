package br.com.stefanini.pages.front;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.front.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;
    public LoginPage(){
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public LoginPage setEmail(String email){
        Driver.visibilityOf(loginMap.inpEmail);
        loginMap.inpEmail.sendKeys(email);
        return this;
    }
    public LoginPage setPassword(String password){
        loginMap.inpPassword.sendKeys(password);
        return this;
    }
    public void clickLogin(){
        loginMap.btnLogin.click();
    }

    public String getPrincipal(){
        Driver.visibilityOf(loginMap.textPrincipal);
        return loginMap.textPrincipal.getText();
    }
}
