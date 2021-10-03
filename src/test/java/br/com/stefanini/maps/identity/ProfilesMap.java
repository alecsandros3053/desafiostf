package br.com.stefanini.maps.identity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilesMap {

    @FindBy(css = "li > a[href='#/identity/profile']")
    public WebElement linkProfiles;
    @FindBy(xpath = "//div[3]//select")
    public WebElement slcEmpresa;
    @FindBy(css = "div > button")
    public WebElement slcTipo;
    @FindBy(xpath = "//span[@class='text' and text() = 'Blotter']")
    public WebElement optBlotter;
    @FindBy(xpath = "//span[@class='text' and text() = 'Identity']")
    public WebElement optIdentity;
    @FindBy(css = "#newProfile")
    public WebElement inpAddProfile;
    @FindBy(css = "th > div > i.delete")
    public WebElement btnExcluir;
    @FindBy(xpath = "//button[text()=' Cancel']")
    public WebElement btnExcluirCancel;
    @FindBy(xpath = "//button[text()=' Yes']")
    public WebElement btnYes;
    @FindBy(css = "th > div > i.edit")
    public WebElement btnEditar;
    @FindBy(css = "input[type='text']")
    public WebElement inpName;
    @FindBy(css = "textarea")
    public WebElement inpDescription;
    @FindBy(css = "//label[text() = 'Area']/../div/select")
    public WebElement slcArea;
    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement btnCancel;
    @FindBy(xpath = "//button[text()=' Save']")
    public WebElement btnSave;
    @FindBy(css = ".notify-message")
    public WebElement textMsg;

}
