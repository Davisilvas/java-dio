import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine();
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    ContaBancaria contaTeste = new ContaBancaria(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:");
    System.out.println("Conta: " + contaTeste.numero);
    System.out.println("Titular: " + contaTeste.titular);
    System.out.printf("Saldo: R$ %.1f%n", contaTeste.saldo);
  }
}

class ContaBancaria {
  int numero;
  String titular;
  double saldo;
  
  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }
}