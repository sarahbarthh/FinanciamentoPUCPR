package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {
    private static final Scanner scanner = new Scanner(System.in);

    // Método que pede ao usuário o valor do imóvel
    public double mostrarValorImovel() {
        double valor;
        while (true) {
            try {
                System.out.println("Digite o valor do imóvel:");
                valor = scanner.nextDouble();
                if (valor <= 0) {
                    throw new IllegalArgumentException("Valor Inválido. O valor deve ser um número positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return valor;
    }

    // Método que pede ao usuário o prazo do financiamento em anos
    public int prazoFinanciamentoEmAnos() {
        int prazo;
        while (true) {
            try {
                System.out.println("Digite o prazo do financiamento em anos:");
                prazo = scanner.nextInt();
                if (prazo <= 0) {
                    throw new IllegalArgumentException("Valor Inválido. O prazo deve ser um número positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return prazo;
    }

    // Método que pede ao usuário a taxa de juros anual
    public double mostrarTaxaJurosAnual() {
        double taxa;
        while (true) {
            try {
                System.out.println("Digite a taxa de juros anual:");
                taxa = scanner.nextDouble();
                if (taxa <= 0) {
                    throw new IllegalArgumentException("Valor Inválido. A taxa de juros deve ser um número positivo.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return taxa;
    }

    // Método que permite ao usuário selecionar o tipo de financiamento
    public int mostrarTipoFinanciamento() {
        int tipo;
        while (true) {
            try {
                System.out.println("Selecione o tipo de financiamento:");
                System.out.println("1. Casa");
                System.out.println("2. Apartamento");
                System.out.println("3. Terreno");
                tipo = scanner.nextInt();
                if (tipo < 1 || tipo > 3) {
                    throw new IllegalArgumentException("Opção inválida. Escolha 1, 2 ou 3.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return tipo;
    }

    // Métodos para coletar informações específicas de cada tipo de financiamento

    public double mostrarTamanhoAreaConstruida() {
        double tamanho = 0;
        while (true) {
            try {
                System.out.println("Digite o tamanho da área construída:");
                tamanho = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
        return tamanho;
    }

    public double mostrarTamanhoTerreno() {
        double tamanho = 0;
        while (true) {
            try {
                System.out.println("Digite o tamanho do terreno:");
                tamanho = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
        return tamanho;
    }

    public int mostrarNumeroVagasGaragem() {
        int numVagas = 0;
        while (true) {
            try {
                System.out.println("Digite o número de vagas na garagem:");
                numVagas = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
        return numVagas;
    }

    public int mostrarNumeroAndar() {
        int numAndar = 0;
        while (true) {
            try {
                System.out.println("Digite o número do andar:");
                numAndar = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
        return numAndar;
    }

    public String mostrarTipoZona() {
        System.out.println("Digite o tipo de zona (exemplo: residencial ou comercial):");
        return scanner.next();
    }
}
