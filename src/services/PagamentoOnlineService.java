package services;

public interface PagamentoOnlineService {

    double juros(Double valor, int meses);

    double taxaPagamento(double taxa);
}
