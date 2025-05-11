import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String cliente;
        double saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o nome do cliente: ");
        cliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
