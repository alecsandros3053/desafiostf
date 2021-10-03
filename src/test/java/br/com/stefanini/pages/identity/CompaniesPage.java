package br.com.stefanini.pages.identity;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.identity.CompaniesMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CompaniesPage {
    CompaniesMap companiesMap;
    public CompaniesPage(){
        companiesMap = new CompaniesMap();
        PageFactory.initElements(Driver.getDriver(), companiesMap);
    }

    public CompaniesPage clickCompanies(){
        companiesMap.linkCompanies.click();
        return this;
    }
    public CompaniesPage clickAdd(){
        companiesMap.btnAdd.click();
        return this;
    }
    public CompaniesPage setName(String name){
        Driver.visibilityOf(companiesMap.inpName);
        companiesMap.inpName.sendKeys(name);
        return this;
    }
    public CompaniesPage selectType(String type){
        Select select = new Select(companiesMap.slcType);
        select.selectByVisibleText(type);
        return this;
    }
    public CompaniesPage setActive(String active){
        companiesMap.inpActive.sendKeys(active);
        return this;
    }
    public CompaniesPage clickCancel(){
        companiesMap.btnCancel.click();
        return this;
    }
    public CompaniesPage clickSave(){
        companiesMap.btnSave.click();
        return this;
    }
    public String getMessagem(){
        Driver.visibilityOf(companiesMap.textMessagem);
        return companiesMap.textMessagem.getText();
    }
}
