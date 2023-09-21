package modelo;

public class Casa extends Financiamento {


    //Método construtor
    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
    }

    @Override
    public double getValorTotalFinanciamento() {
        double valorTotal = super.getValorTotalFinanciamento();
        double desconto = Math.min(100, valorTotal);
        return valorTotal - desconto;
    }

}
