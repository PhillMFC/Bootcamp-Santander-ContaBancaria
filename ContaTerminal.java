import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String agencia = "";
        String nomeCliente = "";
        int numeroConta = 0;
        double saldo = 0.0;

        Scanner terminal = new Scanner(System.in);
        System.out.println("Por favor, insira o número da Agência");
        agencia = terminal.nextLine();
        System.out.println("Por favor, insira o nome do titular da conta");
        nomeCliente = terminal.nextLine();
        System.out.println("Por favor, insira o número da conta");
        numeroConta = terminal.nextInt();
        System.out.println("Por favor, insira o saldo da conta");
        saldo = terminal.nextDouble();
        terminal.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque\n");

    }
}
