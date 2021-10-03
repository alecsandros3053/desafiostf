package br.com.stefanini.steps.front;

import br.com.stefanini.pages.front.BoletaRendaFixaPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class BoletaRendaFixaSteps {
    BoletaRendaFixaPage boletaRendaFixaPage;

    @Dado("que esteja na pagina front renda fixa")
    public void queEstejaNaPaginaFrontRendaFixa() {
        boletaRendaFixaPage = new BoletaRendaFixaPage();
        boletaRendaFixaPage.clickBoleta()
                .clickRendaFixa();
    }


    @Quando("realizo a requisicao de uma boleta de renda fixa com os valores")
    public void realizoARequisicaoDeUmaBoletaDeRendaFixaComOsValores(Map<String, String> map) {
        boletaRendaFixaPage.selectCarteira(map.get("carteira"))
                .selectContraparte(map.get("contraparte"))
                .selectTipo(map.get("tipo"))
                .clickPesquisar()
                .setPesquisaTitulos(map.get("titulo"))
                .clickPesquisarTitulo()
                .clickSelecionarTitulo()
                .setTxOperacao(map.get("txOperacao"))
                .setQuantidade(map.get("quantidade"))
                .selectLiquidacao(map.get("tipoLiquidacao"))
                .selectLocal(map.get("localNegociacao"))
                .setValor(map.get("valor"))
                .clickSalvar();
    }

    @Entao("valido que foi gerada uma boleta de renda fixa")
    public void validoQueFoiGeradaUmaBoletaDeRendaFixa() {
        String[] numero = boletaRendaFixaPage.getNumeroBoleta().split(" ");
        Assert.assertEquals("Nº", numero[0]);
    }



}
