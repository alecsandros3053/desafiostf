package br.com.stefanini.maps.front;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AprovacaoMap {
    @FindBy(partialLinkText = "Aprovação")
    public WebElement linkAprovacao;
    @FindBy(linkText = "Renda Fixa")
    public WebElement linkRendaFixa;
    @FindBy(linkText = "Fundos")
    public WebElement linkFundos;
    @FindBy(linkText = "Renda Variável")
    public WebElement linkRendaVariavel;
    @FindBy(linkText = "BTC")
    public WebElement linkBTC;
    @FindBy(linkText = "BMF")
    public WebElement linkBMF;
    @FindBy(linkText = "Swap")
    public WebElement linkSwap;
    @FindBy(css = "input[placeholder='Dados da boleta...']")
    public WebElement inpDadosBoleta;
    @FindBy(xpath = "//label[text()='Tipo']/../select")
    public WebElement slcTipo;
    @FindBy(xpath = "//label[text()='Área']/../select")
    public WebElement slcArea;
    @FindBy(xpath = "//label[text()='Data inicial']/../input")
    public WebElement inpDataInicial;
    @FindBy(xpath = "//label[text()='Data final']/../input")
    public WebElement inpDataFinal;
    @FindBy(xpath = "//label[text()='Status da Boleta']/../select")
    public WebElement slcStatus;
    @FindBy(xpath = "//span[text()='Pesquisar']/..")
    public WebElement btnPesquisar;
    @FindBy(css = ".btn-success")
    public WebElement btnAprovar;
    @FindBy(css = ".btn-danger")
    public WebElement btnReprovar;
    @FindBy(xpath = "//label[contains(text(), 'Motivo')]/../select")
    public WebElement slcMotivoRejeicao;
    @FindBy(xpath = "//div[3]/button[1]")
    public WebElement btnRejeitar;
    @FindBy(xpath = "//div[3]/button[1]")
    public WebElement btnAprovarModal;
    @FindBy(xpath = "//div[3]/button[2]")
    public WebElement btnCancelar;
}
