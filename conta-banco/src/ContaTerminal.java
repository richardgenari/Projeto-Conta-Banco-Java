import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Validando nome do titular
        String nome;
        while (true) {
            System.out.println("Digite o nome do titular da conta: ");
            nome = scanner.nextLine().trim(); // Remove espaços extras no início e no final
           
            if (!nome.isEmpty() && nome.matches("[a-zA-Z]+")) { // Verifica se o nome contém apenas letras
                break; // Sai do loop se o nome for válido
            } else {
                System.out.println("Erro: O nome do titular deve ser válido. Tente novamente.");
                
            }
        }

        // Validando número da conta
        int conta = 0;
        while (true) {
            System.out.println("Digite o número da conta: ");
            if (scanner.hasNextInt()) {
                conta = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
                if (conta > 0) {
                    break;
                } else {
                    System.out.println("Erro:Numero invalido. Tente novamente.");
                }
            } else {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                scanner.nextLine(); // Limpa o buffer
            }
        }

        // Validando o número da agência
        int agencia;
        while (true) {
            System.out.println("Digite o número da agência ");
            if (scanner.hasNextInt()) {
                agencia = scanner.nextInt(); // Atribui o valor à variável
                scanner.nextLine(); // Limpa o buffer
                if (agencia > 0) {
                    break; // Sai do loop se o número for válido
                } else {
                    System.out.println("Número da agência inválido. Tente novamente.");
                }
            } else {
                System.out.println("Erro: Entrada inválida. Digite um número inteiro.");
                scanner.nextLine(); // Limpa o buffer
            }
        }

        // Validando o saldo
        double saldo;
        while (true) {
            System.out.println("Digite o saldo da sua conta: ");
            if (scanner.hasNextDouble()) { // Verifica se a entrada é um número decimal
                saldo = scanner.nextDouble();
                scanner.nextLine(); // Limpa o buffer
                if (saldo >= 0) {
                    break; // Sai do loop se o saldo for válido
                } else {
                    System.out.println("Erro: O saldo não pode ser negativo. Tente novamente.");
                }
            } else {
                System.out.println("Valores inválidos, tente novamente.");
                scanner.nextLine(); // Limpa o buffer para evitar loop infinito
            }
        }

        // Exibir mensagem final formatada
        System.out.printf("Olá %s, obrigado por criar sua conta em nosso banco!%n", nome);
        System.out.printf("Sua agência é %d, conta %d e seu saldo de R$ %.2f já está disponível para saque.%n", agencia, conta, saldo);

        // Fechar o Scanner
        scanner.close();
    }
}