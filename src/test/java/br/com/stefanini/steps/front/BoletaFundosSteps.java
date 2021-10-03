package br.com.stefanini.steps.front;

import br.com.stefanini.pages.front.BoletaFundosPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.util.Map;

public class BoletaFundosSteps {

    BoletaFundosPage boletaFundosPage;

    @Dado("que esteja na pagina front fundos")
    public void queEstejaNaPaginaFrontFundos() {
        boletaFundosPage = new BoletaFundosPage();
        boletaFundosPage.clickBoleta()
                .clickFundos();
    }


    @Quando("realizo a requisicao de uma boleta de fundos com os valores")
    public void realizoARequisicaoDeUmaBoletaDeFundosComOsValores(Map<String, String> map) {
        boletaFundosPage.selectCliente(map.get("cliente"))
                .selectTipo(map.get("tipo"))
                .setValor(map.get("valor"))
                .selectCarteira(map.get("carteira"))
                .selectTipoLiquidacao(map.get("tipoLiquidacao"))
                .clickSalvar();
    }

    @Entao("valido que foi gerada uma boleta de fundos")
    public void validoQueFoiGeradaUmaBoletaDeFundos() {

    }
}
