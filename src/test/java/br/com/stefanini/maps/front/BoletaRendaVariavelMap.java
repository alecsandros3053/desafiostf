package br.com.stefanini.maps.front;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoletaRendaVariavelMap {
    @FindBy(partialLinkText = "Boleta")
    public WebElement linkBoleta;
    @FindBy(linkText = "Renda Variável")
    public WebElement linkRendaVariavel;
    @FindBy(xpath = "//label[contains(text(),'Carteira')]/../select")
    public WebElement slcCarteira;
    @FindBy(xpath = "//div[2]/div[1]/div[2]/div[1]//select")
    public WebElement slcTipo;
    @FindBy(xpath = "//button[text()='Pesquisar']")
    public WebElement btnPesquisar;
    @FindBy(xpath = "//label[text()='Dados do Ativo']/../input")
    public WebElement inpDadosAtivo;
    @FindBy(css = "input[placeholder='00/00/0000']")
    public WebElement inpVencimento;
    @FindBy(xpath = "//label[text()='Tipo']/../select")
    public WebElement slcTipoAtivo;
    @FindBy(xpath = "//span[text()='Pesquisar']/..")
    public WebElement btnPesquisarAtivo;
    @FindBy(xpath = "//tr[1]//button")
    public WebElement btnSelecionar;
    @FindBy(xpath = "//label[contains(text(),'Conta')]/../select")
    public WebElement slcConta;
    @FindBy(xpath = "//label[contains(text(),'Quantidade')]/../div/div/input")
    public WebElement inpQuantidade;
    @FindBy(xpath = "//label[contains(text(),'Corretora')]/../select")
    public WebElement slcCorretora;
    @FindBy(xpath = "//label[contains(text(),'Tipo ')]/../div/div/select")
    public WebElement slcTipoLiquidacao;
    @FindBy(xpath = "//label[contains(text(),'Valor')]/../input")
    public WebElement inpValor;
    @FindBy(xpath = "//span[text()='Salvar']/..")
    public WebElement btnSalvar;
    @FindBy(css = ".badge-warning")
    public WebElement textNumeroBoleta;

}
