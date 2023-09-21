package modelo;

public class Financiamento {

    //Atributos da classe
    private final double valorImovel;
    private final int prazoFinanciamento;
    private final double taxaJurosAnual;

    //Método Construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    //Método getter para valorImovel
    public double getValorImovel() {
        return valorImovel;
    }

    //Método getter para prazoFinanciamento
    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    //Método getter para taxaJurosAnual
    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    //Método getter para valorTotalFinanciamento
    public double getValorTotalFinanciamento() {
        double valorTotalFinanciamento = valorImovel * Math.pow(1 + taxaJurosAnual / 100, prazoFinanciamento);
        return valorTotalFinanciamento;
    }

    //Método CalcularPagamentoMensal
    public double CalcularPagamentoMensal() {
        double pagamentoMensal = this.valorImovel / (double) this.prazoFinanciamento * (1.0 + this.taxaJurosAnual / 12.0);
        return pagamentoMensal;
    }

    //Método CalcularTotaldoPagamento
    public double CalcularTotaldoPagamento() {
        double pagamentoMensal = this.valorImovel / (double) this.prazoFinanciamento * (1.0 + this.taxaJurosAnual / 12.0);
        double totalPagamento = pagamentoMensal + (double) this.prazoFinanciamento;
        return totalPagamento;
    }

    //Método para mostrar dados do financiamento
    public void mostrarDadosFinanciamento() {

        double valorTotalFinanciamento = this.getPrazoFinanciamento() * this.getTaxaJurosAnual() + this.getValorImovel();
        System.out.println("Valor total do imóvel: " + getValorImovel());
        System.out.println("Valor total do financiamento: " + valorTotalFinanciamento);
    }
}