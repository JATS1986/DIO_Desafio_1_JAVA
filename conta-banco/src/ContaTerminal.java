import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Declaração da variável de entrada dos dados
        Scanner scanner = new Scanner(System.in);

        //Usuário irá digitar o número da conta
        System.out.println("Por favor, digite o número da Conta (ex.: xxxx - deve conter 4 dígitos):");
        int numeroConta = scanner.nextInt();

        //Usuário irá digitar o número da agência da conta
        System.out.println("Por favor, digite o número da Agência (ex.: xxx-x):");
        String agenciaConta = scanner.next();

        //Usuário irá digitar seu nome completo
        System.out.println("Por favor, digite seu nome completo:");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        //Usuário irá digitar o valor de seu saldo na conta
        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();
        
        //Mensagem da conta criada
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agenciaConta + ", conta " + numeroConta + " e seu saldo "+ saldo + " já está disponível para saque!");
    }
}
