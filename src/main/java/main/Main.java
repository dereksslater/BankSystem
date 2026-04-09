package main;

import java.util.Scanner;
import model.ContaBanco;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        ContaBanco pessoa1 = new ContaBanco("Derek", 400);

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        while (true) {

            System.out.println("\nDigite o número da opção abaixo");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar dados");
            System.out.println("4 - Sair");

            int opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Qual valor quer depositar?");
                double valor = sc.nextDouble();
                pessoa1.depositar(valor);

            } else if (opcao == 2) {
                System.out.println("Qual valor quer sacar?");
                double valor2 = sc.nextDouble();
                pessoa1.sacar(valor2);

            } else if (opcao == 3) {
                pessoa1.mostrarDados();

            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida");
            }
        }

        sc.close();
    }
}
