package modelo;

public class Apartamento extends Financiamento {

    //Método construtor
    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double getValorTotalFinanciamento() {
        double valorTotal = super.getValorTotalFinanciamento();
        double numeroMensalidades = getPrazoFinanciamento(); // Obtém o número de mensalidades (prazo)
        double taxaDecrescente = 5.0 / numeroMensalidades; // Calcula a taxa decrescente
        return valorTotal + (valorTotal * taxaDecrescente / 100); // Aplica a taxa ao valor total
    }
}
