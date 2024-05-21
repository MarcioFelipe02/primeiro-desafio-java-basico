import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        
    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo = 2500.20;
    
    Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite o numero da agencia");
        agencia = teclado.nextLine();
        System.out.println("Por favor digite o seu nome");
        nomeCliente = teclado.nextLine();
        System.out.println("por favor digite o numero de sua conta");
        numeroConta = teclado.nextInt();
        System.out.println("Olá" + nomeCliente + "Obrigado por abrir uma conta em nosso banco, sua agencia é"  + agencia + ", conta" + numeroConta + "e seu saldo é de" + saldo + "já esta disponível para saque" );


        



    }
}
