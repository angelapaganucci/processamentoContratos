package services;

public class PaypalService implements PagamentoOnlineService {

    @Override
    public double juros(Double valor, int meses) {
        return valor * 0.01 * meses;
    }

    @Override
    public double taxaPagamento(double taxa) {
        return taxa * 0.02;
    }

}
