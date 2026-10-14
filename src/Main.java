import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        int opcao;

        do {
            System.out.println("===== CALCULADORA JAVA =====");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            if (!sc.hasNextInt()) {
                System.out.println("Erro: digite um número inteiro.");
                sc.nextLine();
                System.out.println();
                continue;
            }

            opcao = sc.nextInt();

            if (opcao == 0) {
                break;
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida!");
                System.out.println();
                continue;
            }

            System.out.print("Digite o primeiro número: ");

            if (!sc.hasNextDouble()) {
                System.out.println("Erro: digite um número válido.");
                sc.nextLine();
                System.out.println();
                continue;
            }

            num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");

            if (!sc.hasNextDouble()) {
                System.out.println("Erro: digite um número válido.");
                sc.nextLine();
                System.out.println();
                continue;
            }

            num2 = sc.nextDouble();

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da soma = " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração = " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação = " + resultado);
                    break;

                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão = " + resultado);
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;
            }

            System.out.println();

        } while (true);

        System.out.println("Calculadora encerrada!");
        sc.close();
    }
}
