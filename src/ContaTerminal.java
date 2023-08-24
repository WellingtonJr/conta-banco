import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Digite a agência:");
        agencia = scanner.next();
        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + "obrigado por abrir uma conta em nosso banco! Sua agência é: "
                + agencia + " e seu número da conta é: " + numero
                + " e seu saldo é: R$" + saldo);

    }
}
