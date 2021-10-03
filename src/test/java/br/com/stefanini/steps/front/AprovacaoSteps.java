package br.com.stefanini.steps.front;

import br.com.stefanini.pages.front.AprovacaoPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.util.Map;

public class AprovacaoSteps {
    AprovacaoPage aprovacaoPage;

    @Dado("que esteja na pagina aprovacao renda fixa")
    public void queEstejaNaPaginaAprovacaoRendaFixa() {
        aprovacaoPage = new AprovacaoPage();
        aprovacaoPage.clickAprovacao()
                .clickRendaFixa();
    }

    @Dado("que esteja na pagina aprovacao renda variavel")
    public void queEstejaNaPaginaAprovacaoRendaVariavel() {
        aprovacaoPage = new AprovacaoPage();
        aprovacaoPage.clickAprovacao()
                .clickRendaVariavel();
    }


    @Quando("realizo a aprovacao de uma boleta com os valores")
    public void realizoAAprovacaoDeUmaBoletaDeRendaFixaComOsValores(Map<String, String> map) {
        aprovacaoPage.setDadosBoleta(map.get("codigo"))
                .selectTipo(map.get("tipo"))
                .selectStatus(map.get("status"))
                .clickPesquisar()
                .clickAprovar();

    }

    @Entao("confirmo a aprovacao da boleta")
    public void confirmoAAprovacaoDaBoleta() {
        aprovacaoPage.clickAprovarModal();
    }


}
