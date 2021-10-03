package br.com.stefanini.pages.front;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.front.BoletaRendaFixaMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BoletaRendaFixaPage {
    BoletaRendaFixaMap boletaRendaFixaMap;
    public BoletaRendaFixaPage(){
        boletaRendaFixaMap = new BoletaRendaFixaMap();
        PageFactory.initElements(Driver.getDriver(), boletaRendaFixaMap);
    }

    public BoletaRendaFixaPage clickBoleta(){
        boletaRendaFixaMap.linkBoleta.click();
        return this;
    }
    public void clickRendaFixa(){
        Driver.visibilityOf(boletaRendaFixaMap.linkRendaFixa);
        boletaRendaFixaMap.linkRendaFixa.click();
    }
    public BoletaRendaFixaPage selectCarteira(String carteira){
        Driver.visibilityOf(boletaRendaFixaMap.slcCarteira);
        Select select = new Select(boletaRendaFixaMap.slcCarteira);
        select.selectByVisibleText(carteira);
        return this;
    }
    public BoletaRendaFixaPage selectTipo(String tipo){
        Select select = new Select(boletaRendaFixaMap.slcTipo);
        select.selectByVisibleText(tipo);
        return this;
    }
    public BoletaRendaFixaPage selectContraparte(String contraparte){
        Select select = new Select(boletaRendaFixaMap.slcContraparte);
        select.selectByVisibleText(contraparte);
        return this;
    }
    public BoletaRendaFixaPage setComando(String comando){
        boletaRendaFixaMap.inpComando.sendKeys(comando);
        return this;
    }
    public BoletaRendaFixaPage clickPesquisar(){
        boletaRendaFixaMap.btnPesquisar.click();
        return this;
    }
    public BoletaRendaFixaPage setPesquisaTitulos(String pesquisaTitulos){
        boletaRendaFixaMap.inpPesquisaTitulos.sendKeys(pesquisaTitulos);
        return this;
    }
    public BoletaRendaFixaPage clickPesquisarTitulo(){
        boletaRendaFixaMap.btnPesquisarTitulo.click();
        return this;
    }
    public BoletaRendaFixaPage clickSelecionarTitulo(){
        boletaRendaFixaMap.btnSelecionarTitulo.click();
        return this;
    }
    public BoletaRendaFixaPage setTxOperacao(String txOperacao){
        Driver.visibilityOf(boletaRendaFixaMap.inpTxOperacao);

        boletaRendaFixaMap.inpTxOperacao.sendKeys(txOperacao);
        return this;
    }
    public BoletaRendaFixaPage setQuantidade(String quantidade){
        boletaRendaFixaMap.inpQuantidade.sendKeys(quantidade);
        return this;
    }
    public BoletaRendaFixaPage selectLiquidacao(String liquidacao){
        Select select = new Select(boletaRendaFixaMap.slcLiquidacao);
        select.selectByVisibleText(liquidacao);
        return this;
    }
    public BoletaRendaFixaPage selectLocal(String local){
        Select select = new Select(boletaRendaFixaMap.slcLocal);
        select.selectByVisibleText(local);
        return this;
    }
    public BoletaRendaFixaPage setValor(String valor){
        boletaRendaFixaMap.inpValor.sendKeys(valor);
        return this;
    }
    public void clickSalvar(){
        boletaRendaFixaMap.btnSalvar.click();
    }

    public String getNumeroBoleta(){
        Driver.visibilityOf(boletaRendaFixaMap.textNumeroBoleta);
        return boletaRendaFixaMap.textNumeroBoleta.getText();
    }
}