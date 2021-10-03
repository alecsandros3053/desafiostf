package br.com.stefanini.maps.front;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoletaFundosMap {
    @FindBy(partialLinkText = "Boleta")
    public WebElement linkBoleta;
    @FindBy(linkText = "Fundos")
    public WebElement linkFundos;
    @FindBy(xpath = "//label[text()='Cliente (Cotista)']/../select")
    public WebElement slcCliente;
    @FindBy(xpath = "//label[text()='Carteira']/../select")
    public WebElement slcCarteira;
    @FindBy(xpath = "//label[text()='Tipo']/../div/div/select")
    public WebElement slcTipo;
    @FindBy(xpath = "//label[text()='Tipo de liquidação']/../div/div/select")
    public WebElement slcTipoLiquidacao;
    @FindBy(xpath = "//label[text()='Valor']/../div/div/input")
    public WebElement inpValor;
    @FindBy(xpath = "//span[text()='Salvar']/..")
    public WebElement btnSalvar;
    @FindBy(css = ".badge-warning")
    public WebElement textNumeroBoleta;

}
