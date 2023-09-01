import java.util.InputMismatchException;
import java.util.Scanner;

public class AulaTryCatch {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o seu nome: ");
            String name = sc.nextLine();

            System.out.print("Nos informe o seu último nome: ");
            String lastName  = sc.nextLine();

            System.out.print("Nos informe a sua idade: ");
            int age = sc.nextInt();

            System.out.print("Nos informe a sua altura: ");
            double height = sc.nextDouble();

            // printing data

            System.out.println(name);
            System.out.println(lastName);
            System.out.println(age);
            System.out.println(height);

        }catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos.");
        }
        
        System.out.println("Isso ta fora do bloco.");
    }
}
