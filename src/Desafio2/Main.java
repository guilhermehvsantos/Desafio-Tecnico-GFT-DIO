package Desafio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instâncias dos veículos
        Veiculo[] veiculos = { new Carro(), new Moto(), new Bicicleta() };

        System.out.println("Escolha o primeiro veículo (0-Carro, 1-Moto, 2-Bicicleta): ");
        int escolha1 = scanner.nextInt();

        System.out.println("Escolha o segundo veículo (0-Carro, 1-Moto, 2-Bicicleta): ");
        int escolha2 = scanner.nextInt();

        Veiculo v1 = veiculos[escolha1];
        Veiculo v2 = veiculos[escolha2];

        System.out.println("\nVeículos escolhidos: " + v1.getNome() + " vs " + v2.getNome());
        v1.Mover();;
        v2.Mover();

        scanner.close();
    }
}
