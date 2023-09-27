import modelo.Financiamento;

import java.io.*;
import java.util.ArrayList;

public class SalvarLerSerializacao {
    public static void salvarFinanciamentosSerializados(ArrayList<Financiamento> financiamentos, String nomeArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(financiamentos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Financiamento> lerFinanciamentosSerializados(String nomeArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            return (ArrayList<Financiamento>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Adicione os financiamentos à lista de financiamentos

        // Salve os financiamentos serializados em um arquivo
        salvarFinanciamentosSerializados(financiamentos, "financiamentos.ser");

        // Leia os financiamentos serializados de um arquivo
        ArrayList<Financiamento> lidos = lerFinanciamentosSerializados("financiamentos.ser");
        if (lidos != null) {
            for (Financiamento financiamento : lidos) {
                System.out.println(financiamento);
            }
        }
    }
}
