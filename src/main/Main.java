package main;

import modelo.Apartamento;
import modelo.Casa;
import modelo.Financiamento;
import modelo.Terreno;
import util.InterfaceUsuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        // Crie um ArrayList para armazenar os financiamentos
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Solicite ao usuário os dados gerais
        double valorImovel = interfaceUsuario.mostrarValorImovel();
        int prazoFinanciamento = interfaceUsuario.prazoFinanciamentoEmAnos();
        double taxaJurosAnual = interfaceUsuario.mostrarTaxaJurosAnual();

        // Solicite ao usuário se é uma Casa, Apartamento ou Terreno
        int tipoFinanciamento = interfaceUsuario.mostrarTipoFinanciamento();

        if (tipoFinanciamento == 1) { // Casa
            double tamanhoAreaConstruida = interfaceUsuario.mostrarTamanhoAreaConstruida();
            double tamanhoTerreno = interfaceUsuario.mostrarTamanhoTerreno();

            Casa casa = new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, tamanhoAreaConstruida, tamanhoTerreno);
            financiamentos.add(casa);
        } else if (tipoFinanciamento == 2) { // Apartamento
            int numeroVagasGaragem = interfaceUsuario.mostrarNumeroVagasGaragem();
            int numeroAndar = interfaceUsuario.mostrarNumeroAndar();

            Apartamento apartamento = new Apartamento(valorImovel, prazoFinanciamento, taxaJurosAnual, numeroVagasGaragem, numeroAndar);
            financiamentos.add(apartamento);
        } else if (tipoFinanciamento == 3) { // Terreno
            String tipoZona = interfaceUsuario.mostrarTipoZona();

            Terreno terreno = new Terreno(valorImovel, prazoFinanciamento, taxaJurosAnual, tipoZona);
            financiamentos.add(terreno);
        } else {
            System.out.println("Opção inválida.");
        }

        // Exiba os dados de todos os financiamentos
        for (Financiamento financiamento : financiamentos) {
            System.out.println("Tipo de financiamento: " + financiamento.getClass().getSimpleName());
            System.out.println("Valor do Imóvel: " + financiamento.getValorImovel());
            System.out.println("Prazo do Financiamento: " + financiamento.getPrazoFinanciamento());
            System.out.println("Taxa de Juros Anual: " + financiamento.getTaxaJurosAnual());
            financiamento.mostrarDadosEspecificos(); // Chama o método específico de cada financiamento
            System.out.println("Valor Total do Financiamento: " + financiamento.calcularValorTotalFinanciamento());
            System.out.println("Pagamento Mensal: " + financiamento.calcularPagamentoMensal());
            System.out.println("Total do Pagamento: " + financiamento.calcularTotalPagamento());
            System.out.println();
        }
    }
}