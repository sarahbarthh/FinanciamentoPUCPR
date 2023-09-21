package util;

import java.util.Scanner;

public class InterfaceUsuario {
    private static final Scanner scanner = new Scanner(System.in);


    //Método que pede ao usuário o valor do imóvel
    public double mostrarValorImovel() {
        double valor;
        //Loop para continuar solicitando o valor até que seja válido
        while (true) {
            System.out.println("Financiamento 1 (Casa) : ");
            System.out.println("Digite o valor do imóvel:");
            valor = scanner.nextDouble(); //Lê o valor do usuário

            //Condição para verificar se o valor é válido
            if (valor <= 0) {
                System.out.println("Valor Inválido. O valor deve ser um número positivo. Digite novamente.");
            } else {
                break;
            }

        }
        return valor;
    }

    //Método que pede ao usuário o prazo do financiamento em anos
    public int prazoFinanciamentoEmAnos() {
        int prazo;
        while (true) {
            System.out.println("Digite o prazo do financiamento em anos:");
            prazo = scanner.nextInt();

            if (prazo <= 0) {
                System.out.println("Valor Inválido. O valor deve ser um número positivo. Digite novamente.");

            } else {
                break;
            }
            try {
                prazo = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Você digitou um valor inválido.O valor deve ser um número inteiro.Digite novamente");
                scanner.nextLine();
            }
        }

        return prazo;
    }

    //Método que pede ao usuário a taxa de juros
    public double mostrarTaxaJurosAnual() {
        double taxa;
        while (true) {
            System.out.println("Digite a taxa de juros anual:");
            taxa = scanner.nextDouble();

            if (taxa <= 0) {
                System.out.println("Valor Inválido. O valor deve ser um número positivo. Digite novamente.");

            } else {
                break;
            }

        }
        return taxa;


    }

}