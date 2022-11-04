import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int numero;
        double saldo;
        String agencia, nomeCliente;

        Scanner sc = new Scanner (System.in);

            System.out.println("Olá, Seja Bem Vindo(a)... \nInfome seu nome completo");
                nomeCliente = sc.nextLine();
        
            System.out.println("Por favor digite o numero de sua agência.  ");
                agencia = sc.nextLine();
        
            System.out.println("Agora, digite o numero de sua conta.");
                numero = sc.nextInt();
        
            System.out.println("Informe seu deposito inicial.");
                saldo = sc.nextDouble();

            System.out.printf("Olá " + nomeCliente + ", Obrigado por abrir uma conta em nosso banco, sua Agência é: " + agencia + ", Conta: "+ numero + " e seu saldo de R$ "+ saldo + " está disponível para saque." );



    }
}
