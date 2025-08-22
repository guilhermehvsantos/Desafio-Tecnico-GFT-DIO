package Desafio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        // Verificação de anagrama
        if (saoAnagramas(palavra1, palavra2)) {
            System.out.println("Resultado: As palavras são anagramas!");
        } else {
            System.out.println("Resultado: As palavras NÃO são anagramas!");
        }

        scanner.close();
    }

    public static boolean saoAnagramas(String p1, String p2) {
        // Remove espaços e coloca tudo em minúsculo
        p1 = p1.replaceAll("\\s+", "").toLowerCase();
        p2 = p2.replaceAll("\\s+", "").toLowerCase();

        // Se tamanhos diferentes, não são anagramas
        if (p1.length() != p2.length()) {
            return false;
        }

        // Converte em array de caracteres e ordena
        char[] arr1 = p1.toCharArray();
        char[] arr2 = p2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compara arrays
        return Arrays.equals(arr1, arr2);
    }
}
