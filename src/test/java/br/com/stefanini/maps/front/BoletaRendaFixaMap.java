package br.com.stefanini.maps.front;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoletaRendaFixaMap {
    @FindBy(partialLinkText = "Boleta")
    public WebElement linkBoleta;
    @FindBy(linkText = "Renda Fixa")
    public WebElement linkRendaFixa;
    @FindBy(css = "select[data-testid='carteira']")
    public WebElement slcCarteira;
    @FindBy(css = "select[data-testid='tipo']")
    public WebElement slcTipo;
    @FindBy(css = "select[data-testid='corretora']")
    public WebElement slcContraparte;
    @FindBy(xpath = "//label[text()='Comando']/../input")
    public WebElement inpComando;
    @FindBy(css = "button[data-testid='pesquisarTitulo']")
    public WebElement btnPesquisar;
    @FindBy(css = "input[placeholder='Dados do título...']")
    public WebElement inpPesquisaTitulos;
    @FindBy(xpath = "//span[text()='Pesquisar']/..")
    public WebElement btnPesquisarTitulo;
    @FindBy(xpath = "//button[contains(text(),'Selecionar')]")
    public WebElement btnSelecionarTitulo;
    @FindBy(xpath = "//label[contains(text(),'Tx Operação')]/../input")
    public WebElement inpTxOperacao;
    @FindBy(css = "input[data-testid='quantidade']")
    public WebElement inpQuantidade;
    @FindBy(css = "select[data-testid='tipoLiquidacao']")
    public WebElement slcLiquidacao;
    @FindBy(xpath = "//label[contains(text(),'Local')]/../select")
    public WebElement slcLocal;
    @FindBy(css = "input[data-testid='Valor']")
    public WebElement inpValor;
    @FindBy(css = "button[data-testid='salvar']")
    public WebElement btnSalvar;
    @FindBy(css = ".badge-warning")
    public WebElement textNumeroBoleta;

}
