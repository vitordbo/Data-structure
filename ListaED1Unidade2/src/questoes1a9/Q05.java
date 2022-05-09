package questoes1a9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import listas.MinhaListaSimples;

public class Q05 {

    // Desenvolva um programa que conte a frequencia de cada palavra de um texto.
    // Leia esse texto de um arquivo.
    // Utilize uma lista simplesmente encadeada. Este programa deve permitir salvar
    // o resultado em um arquivo binário e texto e
    // ler este arquivo em binário e texto.
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        // arquivo para texto a ser lido e palavras contadas
        String path = "frasesEscritas.txt";

        // arquivo para armazenar resultado da contagem;
        String pathWrite = "contagem.bin";
        String pathWrite2 = "contagem2.txt";

        MinhaListaSimples<String> teste = new MinhaListaSimples<String>();

        teste = lerFrases(path);

        String textoCompleto = ("");

        for (int i = 0; i <= teste.size; i++) {
            textoCompleto += teste.removeFirst();
        }

        contador(textoCompleto, pathWrite);
        contador(textoCompleto, pathWrite2);
    }

    public static void contador(String frase, String path) throws IOException {

        frase = frase.toLowerCase();

        String[] frasesSeparada = frase.split(" ");
        String[] fraseEscrita = new String[frasesSeparada.length];

        for (int i = 0; i < frasesSeparada.length; i++) {
            int cont = 0;

            for (int j = 0; j < frasesSeparada.length; j++) {
                if (frasesSeparada[i].equals(frasesSeparada[j])) {
                    cont++;
                }
            }

            int verifique = 0;

            for (int z = 0; z < fraseEscrita.length; z++) {

                if (frasesSeparada[i].equals(fraseEscrita[z])) {
                    verifique = 1;
                }
            }

            fraseEscrita[i] = frasesSeparada[i];

            if (verifique == 0) {

                String resultaddo = fraseEscrita[i] + " = " + cont + " ";
                escrever(path, resultaddo);
            }

        }
    }

    public static void escrever(String path, String frase) throws IOException {

        BufferedWriter buffer = new BufferedWriter(new FileWriter(path, true));
        buffer.append(frase + '\n');
        buffer.close();
    }

    public static void ler(String path) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(path));
        String linha = buffer.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = buffer.readLine();
        }

        buffer.close();

    }

    @SuppressWarnings("rawtypes")
    public static MinhaListaSimples lerFrases(String path) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(path));
        String linha = buffer.readLine();

        MinhaListaSimples<String> fraseTexto = new MinhaListaSimples<String>();

        while (linha != null) {

            fraseTexto.addLast(linha);
            linha = buffer.readLine();
        }

        buffer.close();
        return fraseTexto;
    }
}