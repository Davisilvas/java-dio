import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String inputClientName;
        int inputAgence, inputAccountId;
        double inputBalance;
        
        System.out.println("Bem vindo ao Banco X. Fique atento para a abertura de sua conta.");
       
        System.out.print("Nos informe o seu nome completo: ");
        inputClientName = sc.nextLine();

        System.out.print("Nos informe o nome da presente agência: ");
        inputAgence = sc.nextInt();

        System.out.print("Nos informe o número de sua conta: ");
        inputAccountId = sc.nextInt();

        System.out.print("Nos informe o seu saldo: ");
        inputBalance = sc.nextDouble();
    
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %d, sua conta é %d e seu saldo R$%.2f já está disponível para saque%n.", inputClientName, inputAgence, inputAccountId, inputBalance);

        sc.close();
    }
}
