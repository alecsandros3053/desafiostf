package br.com.stefanini.pages.front;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.front.BoletaFundosMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BoletaFundosPage {
    BoletaFundosMap boletaFundosMap;
    public BoletaFundosPage(){
        boletaFundosMap = new BoletaFundosMap();
        PageFactory.initElements(Driver.getDriver(), boletaFundosMap);
    }

    public BoletaFundosPage clickBoleta(){
        boletaFundosMap.linkBoleta.click();
        return this;
    }
    public BoletaFundosPage clickFundos(){
        boletaFundosMap.linkFundos.click();
        return this;
    }
    public BoletaFundosPage selectCliente(String cliente){
        Driver.visibilityOf(boletaFundosMap.slcCliente);
        Select select = new Select(boletaFundosMap.slcCliente);
        select.selectByVisibleText(cliente);
        return this;
    }
    public BoletaFundosPage selectCarteira(String carteira){
        Select select = new Select(boletaFundosMap.slcCarteira);
        select.selectByVisibleText(carteira);
        return this;
    }
    public BoletaFundosPage selectTipo(String tipo){
        Select select = new Select(boletaFundosMap.slcTipo);
        select.selectByVisibleText(tipo);
        return this;
    }
    public BoletaFundosPage selectTipoLiquidacao(String tipoLiquidacao){
        Select select = new Select(boletaFundosMap.slcTipoLiquidacao);
        select.selectByVisibleText(tipoLiquidacao);
        return this;
    }
    public BoletaFundosPage setValor(String valor){
        boletaFundosMap.inpValor.sendKeys(valor);
        return this;
    }
    public void clickSalvar(){
        boletaFundosMap.btnSalvar.click();
    }

    public String getNumeroBoleta(){
        Driver.visibilityOf(boletaFundosMap.textNumeroBoleta);
        return boletaFundosMap.textNumeroBoleta.getText();
    }
}
