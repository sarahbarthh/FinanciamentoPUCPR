package modelo;

public class Terreno extends Financiamento {

    //Método construtor
    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double getValorTotalFinanciamento() {
        double valorTotal = super.getValorTotalFinanciamento();
        double acrescimo = valorTotal * 0.02; // Calcula o acréscimo de 2%
        return valorTotal + acrescimo; // Aplica o acréscimo ao valor total
    }
}
