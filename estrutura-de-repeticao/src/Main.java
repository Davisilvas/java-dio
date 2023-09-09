import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        boolean depositado = false;
        double saldo; 
        
        while (!depositado){
            double valor = scanner.nextDouble();

            if (valor > 0) {
                saldo = valor;
                System.out.printf("Deposito realizado com sucesso!%n Saldo atual: R$%.2f%n", saldo);
                depositado = true;
            } else if (valor == 0) {
                System.out.println("Encerrando o programa... || Valor invalido! Digite um valor maior que zero.");
            } else {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
            }
        }
    }
}