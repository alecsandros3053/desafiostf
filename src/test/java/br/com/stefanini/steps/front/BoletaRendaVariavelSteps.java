package br.com.stefanini.steps.front;

import br.com.stefanini.pages.front.BoletaRendaVariavelPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class BoletaRendaVariavelSteps {
    BoletaRendaVariavelPage boletaRendaVariavelPage;

    @Dado("que esteja na pagina front renda variavel")
    public void queEstejaNaPaginaFrontRendaVariavel() {
        boletaRendaVariavelPage = new BoletaRendaVariavelPage();
        boletaRendaVariavelPage.clickBoleta()
                .clickRendaVariavel();
    }


    @Quando("realizo a requisicao de uma boleta de renda variavel com os valores")
    public void realizoARequisicaoDeUmaBoletaDeRendaVariavelComOsValores(Map<String, String> map) {
        boletaRendaVariavelPage.selectCarteira(map.get("carteira"))
                .clickPesquisar()
                .setDadosAtivo(map.get("ativo"))
                .selectTipoAtivo(map.get("tipoMercado"))
                .clickPesquisarAtivo()
                .clickSelecionar()
                .setQuantidade(map.get("quantidade"))
                .selectTipo(map.get("tipo"))
                .selectConta(map.get("conta"))
                .selectCorretora(map.get("corretora"))
                .selectTipoLiquidacao(map.get("tipoLiquidacao"))
                .setValor(map.get("valor"))
                .clickSalvar();

    }

    @Entao("valido que foi gerada uma boleta de renda variavel")
    public void validoQueFoiGeradaUmaBoletaDeRendaVariavel() {
        String[] numero = boletaRendaVariavelPage.getNumeroBoleta().split(" ");
        Assert.assertEquals("Nº", numero[0]);
    }
}
