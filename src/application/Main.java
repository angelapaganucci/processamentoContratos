package application;

import entities.Contrato;
import entities.Parcela;
import services.ContratoService;
import services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int numeroContrato = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        Double valorTotalContrato = sc.nextDouble();

        Contrato contrato = new Contrato(numeroContrato, dataContrato, valorTotalContrato);

        System.out.print("Entre com o numero de parcelas: ");
        int quantidadeParcelas = sc.nextInt();

        ContratoService contratoService = new ContratoService(new PaypalService());

        contratoService.processarContrato(contrato, 3);

        System.out.println("Parcelas:");

        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(parcela);

        }


        sc.close();
    }
}