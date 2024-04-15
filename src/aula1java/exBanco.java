package aula1java;
import java.util.Scanner;

public class exBanco {
    public static void main(String[] args) {
        String nome = "Gianluca Bonatto";
        String conta = "Corrente";
        double saldo = 20000.00;
        int opcao = 0;

        System.out.println("**************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("\nSaldo bancário: " + saldo);
        System.out.println("**************************");

        String menu = """
                Digite sua opção:

                1- Consultar saldo
                2- Tranferir valor
                3- Receber valor
                4- Sair
                """;

        @SuppressWarnings("resource")
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atualizado é: " + saldo);

            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja tranferir:");
                
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("Saldo insuficiente para realizar a tranferência");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = leitura.nextDouble();
                saldo += valor;

                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}
