package modelo;

public abstract class Financiamento {
    private final double valorImovel;
    private final int prazoFinanciamento;
    private final double taxaJurosAnual;

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    // Métodos comuns para calcular o valor total do financiamento, pagamento mensal e total do pagamento
    public double calcularValorTotalFinanciamento() {
        return valorImovel * Math.pow(1 + taxaJurosAnual / 100, prazoFinanciamento);
    }

    public double calcularPagamentoMensal() {
        return valorImovel / (double) prazoFinanciamento * (1.0 + taxaJurosAnual / 12.0);
    }

    public double calcularTotalPagamento() {
        return calcularPagamentoMensal() * prazoFinanciamento;
    }

    // Métodos abstratos que as subclasses devem implementar
    public abstract void mostrarDadosEspecificos();

    public abstract void cadastrarDadosEspecificos();
}