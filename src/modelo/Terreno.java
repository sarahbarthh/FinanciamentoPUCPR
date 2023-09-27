package modelo;

public class Terreno extends Financiamento {
    private final String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    @Override
    public void mostrarDadosEspecificos() {
        System.out.println("Tipo de zona: " + tipoZona);
    }

    @Override
    public void cadastrarDadosEspecificos() {
        // Solicitar ao usuário os valores específicos para um terreno e definir os atributos
    }
}
