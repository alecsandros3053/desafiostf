package br.com.stefanini.maps.identity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#name")
    public WebElement inpUserName;
    @FindBy(css = "#email")
    public WebElement inpUserEmail;
    @FindBy(css = "#password")
    public WebElement inpPassword;
    @FindBy(css = "#register")
    public WebElement btnLogin;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/h2[2]")
    public WebElement textHome;

}