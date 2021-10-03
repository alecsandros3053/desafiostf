package br.com.stefanini.maps.front;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#exampleInputEmail1")
    public WebElement inpEmail;
    @FindBy(css = "#exampleInputPassword1")
    public WebElement inpPassword;
    @FindBy(css = ".btn")
    public WebElement btnLogin;
    @FindBy(css = "h6")
    public WebElement textPrincipal;

}
