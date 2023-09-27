package modelo;

public class Casa extends Financiamento {
    private final double tamanhoAreaConstruida;
    private final double tamanhoTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double tamanhoAreaConstruida, double tamanhoTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tamanhoAreaConstruida = tamanhoAreaConstruida;
        this.tamanhoTerreno = tamanhoTerreno;
    }

    @Override
    public void mostrarDadosEspecificos() {
        System.out.println("Tamanho da área construída: " + tamanhoAreaConstruida);
        System.out.println("Tamanho do terreno: " + tamanhoTerreno);
    }

    @Override
    public void cadastrarDadosEspecificos() {
        // Solicitar ao usuário os valores específicos para uma casa e definir os atributos
    }

    // Método para calcular os juros da mensalidade
    public double calcularJurosMensalidade() {
        return (getValorImovel() * (getTaxaJurosAnual() / 12)) / (1 - Math.pow(1 + (getTaxaJurosAnual() / 12), -getPrazoFinanciamento()));
    }

    // Método para verificar se o desconto é maior do que os juros da mensalidade
    public void verificarDesconto(double desconto) throws DescontoMaiorDoQueJurosException {
        double jurosMensalidade = calcularJurosMensalidade();
        if (desconto > jurosMensalidade) {
            throw new DescontoMaiorDoQueJurosException();
        }
    }
}
