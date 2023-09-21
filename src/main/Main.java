package main;

import modelo.Financiamento;

import java.util.ArrayList;

//Método principal do programa
public class Main {
    private ArrayList<Financiamento> financiamentos;

    public static void main(String[] args) {

        ArrayList<Financiamento> financiamentos = new ArrayList<>();


        Financiamento casa2 = new Financiamento(150.000, 12, 2);
        Financiamento apartamento1 = new Financiamento(245.500, 7, 2.5);
        Financiamento apartamento2 = new Financiamento(500.000, 10, 1.5);
        Financiamento terreno = new Financiamento(740.000, 8, 1.5);

        financiamentos.add(casa2);
        financiamentos.add(apartamento1);
        financiamentos.add(apartamento2);
        financiamentos.add(terreno);


        double totalFinanciamentos = 0.0;
        for (Financiamento financiamento : financiamentos) {
            double prazo = financiamento.getPrazoFinanciamento();
            double taxaJurosAnual = financiamento.getTaxaJurosAnual();
            double valorImovel = financiamento.getValorImovel();
            double valorTotalFinanciamento = valorImovel * Math.pow(1 + taxaJurosAnual / 100, prazo);


        }

        System.out.println("Financiamento 2: " + casa2.getValorImovel() + " Valor do financiamento: " + casa2.getValorTotalFinanciamento());
        System.out.println("Financiamento 3: " + apartamento1.getValorImovel() + " Valor do financiamento: " + apartamento1.getValorTotalFinanciamento());
        System.out.println("Financiamento 4: " + apartamento2.getValorImovel() + " Valor do financiamento: " + apartamento2.getValorTotalFinanciamento());
        System.out.println("Financiamento 5: " + terreno.getValorImovel() + " Valor do financiamento: " + terreno.getValorTotalFinanciamento());


        util.InterfaceUsuario interfaceUsuario = new util.InterfaceUsuario();

        //Usandos os métodos de InterfaceUsuario para ler os dados
        double valorImovel = interfaceUsuario.mostrarValorImovel();
        int prazoFinanciamento = interfaceUsuario.prazoFinanciamentoEmAnos();
        double taxaJurosAnual = interfaceUsuario.mostrarTaxaJurosAnual();

        //Instanciando um objeto da classe Financiamento com os dados lidos
        modelo.Financiamento financiamento = new modelo.Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);

        //Usando métodos da classe Financiamento para criar o financiamento
        double pagamentoMensal = financiamento.CalcularPagamentoMensal();
        double totalPagamento = financiamento.CalcularTotaldoPagamento();


        System.out.println("Pagamento mensal:" + pagamentoMensal + casa2.CalcularPagamentoMensal());
        System.out.println("Total pagamento:" + totalPagamento);
    }

    public double calcularTotalFinanciamento() {
        double totalFinanciamento = 0.0;
        for (Financiamento financiamento : this.financiamentos) {
            double prazo = financiamento.getPrazoFinanciamento();
            double taxaJurosAnual = financiamento.getTaxaJurosAnual();
            double valorImovel = financiamento.getValorImovel();

            double valorTotalFinanciamento = (valorImovel * Math.pow(1 + taxaJurosAnual / 100, prazo));

            totalFinanciamento += valorTotalFinanciamento;
        }
        return totalFinanciamento;
    }
}