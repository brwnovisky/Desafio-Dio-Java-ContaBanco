package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
    int Numero;
    String Agencia;
    String NomeCliente;
    float Saldo;
    
    public void inserirDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao Conta Banco Terminal");
        System.out.println("Por favor digite os seguintes abaixo.");
        
        System.out.print("Nùmero da Conta: ");
        Numero = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Agência: ");
        Agencia = sc.nextLine();
        
        System.out.print("Saldo da Conta: ");
        Saldo = sc.nextFloat();
        sc.nextLine();
        
        System.out.print("Nome do Cliente: ");
        NomeCliente = sc.nextLine();
    }
    
    public void mostrarDados() {
        System.out.println("Olá " + NomeCliente + ", " +
                "obrigado por criar uma conta em nosso " +
                "banco, sua agência é " + Agencia + ", conta " + Numero +
                " e seu saldo " + Saldo + " já está disponível para saque.");
    }
    
}
