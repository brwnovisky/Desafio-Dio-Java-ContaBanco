import contaBanco.ContaTerminal;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        
        conta.inserirDados();
        conta.mostrarDados();
    }
}