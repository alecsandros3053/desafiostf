package br.com.stefanini.pages.front;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.front.BoletaRendaVariavelMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BoletaRendaVariavelPage {
    BoletaRendaVariavelMap boletaRendaVariavelMap;
    public BoletaRendaVariavelPage(){
        boletaRendaVariavelMap = new BoletaRendaVariavelMap();
        PageFactory.initElements(Driver.getDriver(), boletaRendaVariavelMap);
    }

    public BoletaRendaVariavelPage clickBoleta(){
        boletaRendaVariavelMap.linkBoleta.click();
        return this;
    }
    public void clickRendaVariavel(){
        Driver.visibilityOf(boletaRendaVariavelMap.linkRendaVariavel);
        boletaRendaVariavelMap.linkRendaVariavel.click();
    }
    public BoletaRendaVariavelPage selectCarteira(String carteira){
        Driver.visibilityOf(boletaRendaVariavelMap.slcCarteira);
        Select select = new Select(boletaRendaVariavelMap.slcCarteira);
        select.selectByVisibleText(carteira);
        return this;
    }
    public BoletaRendaVariavelPage selectTipo(String tipo){
        Select select = new Select(boletaRendaVariavelMap.slcTipo);
        select.selectByVisibleText(tipo);
        return this;
    }
    public BoletaRendaVariavelPage clickPesquisar(){
        boletaRendaVariavelMap.btnPesquisar.click();
        return this;
    }
    public BoletaRendaVariavelPage setDadosAtivo(String dadosAtivo){
        boletaRendaVariavelMap.inpDadosAtivo.sendKeys(dadosAtivo);
        return this;
    }
    public BoletaRendaVariavelPage setVencimento(String vencimento){
        boletaRendaVariavelMap.inpVencimento.sendKeys(vencimento);
        return this;
    }
    public BoletaRendaVariavelPage selectTipoAtivo(String tipo){
        Select select = new Select(boletaRendaVariavelMap.slcTipoAtivo);
        select.selectByVisibleText(tipo);
        return this;
    }
    public BoletaRendaVariavelPage clickPesquisarAtivo(){
        boletaRendaVariavelMap.btnPesquisarAtivo.click();
        return this;
    }
    public BoletaRendaVariavelPage clickSelecionar(){
        Driver.visibilityOf(boletaRendaVariavelMap.btnSelecionar);
        boletaRendaVariavelMap.btnSelecionar.click();
        return this;
    }
    public BoletaRendaVariavelPage selectConta(String conta){
        Select select = new Select(boletaRendaVariavelMap.slcConta);
        select.selectByVisibleText(conta);
        return this;
    }
    public BoletaRendaVariavelPage setQuantidade(String quantidade){
        boletaRendaVariavelMap.inpQuantidade.sendKeys(quantidade);
        return this;
    }
    public BoletaRendaVariavelPage selectCorretora(String corretora){
        Select select = new Select(boletaRendaVariavelMap.slcCorretora);
        select.selectByVisibleText(corretora);
        return this;
    }
    public BoletaRendaVariavelPage selectTipoLiquidacao(String tipoLiquidacao){
        Select select = new Select(boletaRendaVariavelMap.slcTipoLiquidacao);
        select.selectByVisibleText(tipoLiquidacao);
        return this;
    }
    public BoletaRendaVariavelPage setValor(String valor){
        boletaRendaVariavelMap.inpValor.sendKeys(valor);
        return this;
    }
    public BoletaRendaVariavelPage clickSalvar(){
        boletaRendaVariavelMap.btnSalvar.click();
        return this;
    }

    public String getNumeroBoleta(){
        Driver.visibilityOf(boletaRendaVariavelMap.textNumeroBoleta);
        return boletaRendaVariavelMap.textNumeroBoleta.getText();
    }
}
