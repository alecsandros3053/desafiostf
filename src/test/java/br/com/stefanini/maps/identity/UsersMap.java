package br.com.stefanini.maps.identity;

import br.com.stefanini.core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersMap {
    @FindBy(xpath = "//div[3]//select")
    public WebElement slcEmpresa;
    @FindBy(css = "a[href='#/identity/users']")
    public WebElement linkUsers;
    @FindBy(xpath = "//span[text()='Add']/..")
    public WebElement btnAdd;
    @FindBy(css = "input[placeholder='Inform the user']")
    public WebElement inpUser;
    @FindBy(css = "input[placeholder='User email']")
    public WebElement inpEmail;
    @FindBy(xpath = "//a[text()='Continue ']")
    public WebElement btnContinue;
    @FindBy(xpath = "//a[text()='Cancel']")
    public WebElement btnCancel;
    @FindBy(css = "button[data-toggle='dropdown']")
    public WebElement btnApplication;
    @FindBy(xpath = "//button[text()='Select All']")
    public WebElement btnSelectAll;
    @FindBy(xpath = "//button[text()='Deselect All']")
    public WebElement btnDeselectAll;
    @FindBy(xpath = "//a[text()=' Back ']")
    public WebElement btnBackApplications;
    @FindBy(css = "button[title='Nothing selected']")
    public WebElement btnSelectProfile;
    public WebElement optProfile(String option){
        return Driver.getDriver().findElement(By.xpath("//span[text()='"+option+"']/.."));
    }
    @FindBy(xpath = "//a[text()='Save ']")
    public WebElement btnSave;
    @FindBy(css = ".notify-message")
    public WebElement textMsg;


}
