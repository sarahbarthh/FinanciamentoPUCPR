import modelo.Financiamento;

import java.io.*;
import java.util.ArrayList;

public class SalvarLerArquivoTexto {
    public static void salvarFinanciamentosEmArquivo(ArrayList<Financiamento> financiamentos, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Financiamento financiamento : financiamentos) {
                writer.write(financiamento.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Financiamento> lerFinanciamentosDeArquivo(String nomeArquivo) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                // Parse a linha para criar um objeto Financiamento e adicione-o à lista de financiamentos
                // Aqui você precisa implementar a lógica de parsing com base na estrutura do arquivo.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return financiamentos;
    }

    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Adicione os financiamentos à lista de financiamentos

        // Salve os financiamentos em um arquivo de texto
        salvarFinanciamentosEmArquivo(financiamentos, "financiamentos.txt");

        // Leia os financiamentos de um arquivo de texto
        ArrayList<Financiamento> lidos = lerFinanciamentosDeArquivo("financiamentos.txt");
        for (Financiamento financiamento : lidos) {
            System.out.println(financiamento);
        }
    }
}
