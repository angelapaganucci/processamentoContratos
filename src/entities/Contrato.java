package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

    private int numero;
    private LocalDate dataContrato;
    private Double valorTotal;

    private List<Parcela> parcelas = new ArrayList<>();


    public Contrato() {
    }

    public Contrato(int numero, LocalDate dataContrato, Double valorTotal) {
        this.numero = numero;
        this.dataContrato = dataContrato;
        this.valorTotal = valorTotal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate data) {
        this.dataContrato = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }
}
