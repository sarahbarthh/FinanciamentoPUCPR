package modelo;

public class Apartamento extends Financiamento {
    private final int numeroVagasGaragem;
    private final int numeroAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int numeroVagasGaragem, int numeroAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numeroVagasGaragem = numeroVagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    @Override
    public void mostrarDadosEspecificos() {
        System.out.println("Número de vagas na garagem: " + numeroVagasGaragem);
        System.out.println("Número do andar: " + numeroAndar);
    }

    @Override
    public void cadastrarDadosEspecificos() {
        // Solicitar ao usuário os valores específicos para um apartamento e definir os atributos
    }
}
