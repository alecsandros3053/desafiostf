package br.com.stefanini.maps.identity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompaniesMap {
    @FindBy(css = "li > a[href='#/identity/companies']")
    public WebElement linkCompanies;
    @FindBy(xpath = "//span[text()='Add']/..")
    public WebElement btnAdd;
    @FindBy(css = "div > input")
    public WebElement inpName;
    @FindBy(css = "select")
    public WebElement slcType;
    @FindBy(css = ".mt-checkbox")
    public WebElement inpActive;
    @FindBy(xpath = "//button[text() = 'Cancel']")
    public WebElement btnCancel;
    @FindBy(xpath = "//button[text() = ' Save']")
    public WebElement btnSave;
    @FindBy(css = ".notify-message")
    public WebElement textMessagem;
}
