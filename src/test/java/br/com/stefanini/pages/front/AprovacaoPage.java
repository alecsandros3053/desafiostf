package br.com.stefanini.pages.front;

import br.com.stefanini.core.Driver;
import br.com.stefanini.maps.front.AprovacaoMap;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AprovacaoPage {
    AprovacaoMap aprovacaoMap;
    public AprovacaoPage(){
        aprovacaoMap = new AprovacaoMap();
        PageFactory.initElements(Driver.getDriver(), aprovacaoMap);
    }

    public AprovacaoPage clickAprovacao(){
        aprovacaoMap.linkAprovacao.click();
        return this;
    }
    public AprovacaoPage clickRendaFixa(){
        aprovacaoMap.linkRendaFixa.click();
        return this;
    }
    public AprovacaoPage clickFundos(){
        aprovacaoMap.linkFundos.click();
        return this;
    }
    public void clickRendaVariavel(){
        Driver.visibilityOf(aprovacaoMap.linkRendaVariavel);
        aprovacaoMap.linkRendaVariavel.click();
    }
    public AprovacaoPage clickBTC(){
        aprovacaoMap.linkBTC.click();
        return this;
    }
    public AprovacaoPage clickBMF(){
        aprovacaoMap.linkBMF.click();
        return this;
    }
    public AprovacaoPage clickSwap(){
        aprovacaoMap.linkSwap.click();
        return this;
    }
    public AprovacaoPage setDadosBoleta(String dadosBoleta){
        Driver.visibilityOf(aprovacaoMap.inpDadosBoleta);
        aprovacaoMap.inpDadosBoleta.sendKeys(dadosBoleta);
        return this;
    }
    public AprovacaoPage selectTipo(String tipo){
        Select select = new Select(aprovacaoMap.slcTipo);
        select.selectByVisibleText(tipo);
        return this;
    }
    public AprovacaoPage selectArea(String area){
        Select select = new Select(aprovacaoMap.slcArea);
        select.selectByVisibleText(area);
        return this;
    }
    public AprovacaoPage setDataInicial(String dataInicial){
        aprovacaoMap.inpDataInicial.sendKeys(dataInicial);
        return this;
    }
    public AprovacaoPage setDataFinal(String dataFinal){
        aprovacaoMap.inpDataFinal.sendKeys(dataFinal);
        return this;
    }
    public AprovacaoPage selectStatus(String status){
        Select select = new Select(aprovacaoMap.slcStatus);
        select.selectByVisibleText(status);
        return this;
    }
    public AprovacaoPage clickPesquisar(){
        aprovacaoMap.btnPesquisar.click();
        return this;
    }
    public AprovacaoPage clickAprovar(){
        Driver.visibilityOf(aprovacaoMap.btnAprovar);
        aprovacaoMap.btnAprovar.click();
        return this;
    }
    public AprovacaoPage clickReprovar(){
        aprovacaoMap.btnReprovar.click();
        return this;
    }
    public AprovacaoPage selectMotivoRejeicao(String motivoRejeicao){
        Select select = new Select(aprovacaoMap.slcMotivoRejeicao);
        select.selectByVisibleText(motivoRejeicao);
        return this;
    }
    public AprovacaoPage clickRejeitar(){
        aprovacaoMap.btnRejeitar.click();
        return this;
    }

    public AprovacaoPage clickAprovarModal(){
        Driver.visibilityOf(aprovacaoMap.btnAprovarModal);
        aprovacaoMap.btnAprovarModal.click();
        return this;
    }

    public AprovacaoPage clickCancelar(){
        aprovacaoMap.btnCancelar.click();
        return this;
    }


}
