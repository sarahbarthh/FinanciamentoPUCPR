package modelo;

public class DescontoMaiorDoQueJurosException extends Exception {
    public DescontoMaiorDoQueJurosException() {
        super("O valor do desconto não pode ser maior do que o valor dos juros da mensalidade.");
    }
}
