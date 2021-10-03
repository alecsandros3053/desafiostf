package br.com.stefanini.maps.identity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsMap {
    @FindBy(xpath = "//div[3]//select")
    public WebElement slcEmpresa;
    @FindBy(css = "a[href='#/identity/settings']")
    public WebElement linkSettings;
    @FindBy(xpath = "//label[text()='Block users after']/../input")
    public WebElement inpBlockUsersAfter;
    @FindBy(xpath = "//label[text()='Do not reuse the last']/../input")
    public WebElement inpReuseTheLast;
    @FindBy(xpath = "//label[text()='Expire the password every']/../input")
    public WebElement inpExpirePassword;
    @FindBy(xpath = "//label[text()='Expire the session every']/../input")
    public WebElement inpExpireSession;
    @FindBy(xpath = "//label[text()='Expire access invitation in']/../input")
    public WebElement inpExpireInvitation;
    @FindBy(xpath = "//label[text()='The password must have at least']/../input")
    public WebElement inpPasswordMustHave;
    @FindBy(css = "button")
    public WebElement btnSave;
    @FindBy(css = ".notify-message")
    public WebElement textMsg;
}
