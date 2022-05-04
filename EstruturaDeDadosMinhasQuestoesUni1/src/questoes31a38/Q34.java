package questoes31a38;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q34 {
	// Evolua a questão anterior. Permita que o programa salve o resultado em um arquivo csv. Permita que o programa abra o arquivo 
	// de texto csv e exiba o conteudo na tela

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        String path = "src/questoes31a38/ContandoPalavras.csv";
        BufferedWriter buffer = new BufferedWriter(new FileWriter(path));

        System.out.print("Digite a Frase: ");
        String frase = in.nextLine();  // receber a linha completa

        System.out.println("A frase digitada foi: " + frase);
        System.out.println("----------------------------------------");
 

        contador(frase, path, buffer);
        buffer.close();
        
        // mostrando pelo java o que foi salvo no arquivo
        leitor(path);
        System.out.println("\n----------------------------------------");
    }

    public static void contador(String frase, String path, BufferedWriter buffer) throws IOException {
    	// conatdor de palavras
        frase = frase.toLowerCase();
        frase = frase.trim();

        String[] frasesSeparada = frase.split(" ");  // separar em um array as palavras
        String[] fraseEscrita = new String[frasesSeparada.length];  

        for (int i = 0; i < frasesSeparada.length; i++) {
            int cont = 0;

            for (int j = 0; j < frasesSeparada.length; j++) {
                if (frasesSeparada[i].equals(frasesSeparada[j])) {
                    cont++;  // se tem a palavra
                }
            }

            int verifique = 0;

            for (int z = 0; z < fraseEscrita.length; z++) {

                if (frasesSeparada[i].equals(fraseEscrita[z])) { // não deve ser igual
                    verifique = 1;
                }
            }

            fraseEscrita[i] = frasesSeparada[i];  // segundo array vai receber o primeiro

            if (verifique == 0) {  // se não deu igual => tem palavras para escrever
                String save = fraseEscrita[i] + " = " + cont + "; "; // vai salvar com esse formato do .csv
                escrever(path, save, buffer);
            }

        }
    }

    public static void escrever(String path, String frase, BufferedWriter buffer) throws IOException {
        buffer.append(frase); // vai escrever no csv
    }

    public static void leitor(String path) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader(path));
        String linha = read.readLine();

        while (linha != null) {  // enquanto tiver coisa no arquivo

            System.out.print(linha);  // mostra tudo que tem no .csv
            linha = read.readLine();
        }

        read.close();  
    }
}
