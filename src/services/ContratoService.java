package services;

import entities.Contrato;
import entities.Parcela;

import java.time.LocalDate;

public class ContratoService {

    private PagamentoOnlineService pagamentoOnlineService;

    public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    public void processarContrato(Contrato contrato, int meses) {

        double parcelaBasica = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++) {
            LocalDate vencimento = contrato.getDataContrato().plusMonths(i);

            double juros = pagamentoOnlineService.juros(parcelaBasica, i);
            double taxa = pagamentoOnlineService.taxaPagamento(parcelaBasica + juros);
            double parcelaFinal = parcelaBasica + juros + taxa;

            contrato.getParcelas().add(new Parcela(vencimento, parcelaFinal));

        }
    }
}
