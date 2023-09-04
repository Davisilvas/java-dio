import java.util.Scanner; 

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nos informe o primeiro número: ");
        int firstInput = sc.nextInt();

        System.out.print("Nos informe o segundo número: ");
        int secondInput = sc.nextInt();

        try {
            contar(firstInput, secondInput);
        } catch (parametrosInvalidosException e) {
            System.out.println("O secondInput não pode ser menor que o firstInput.");
        }

    }

    static void contar (int numberOne, int numberTwo) throws parametrosInvalidosException{
        if (numberOne > numberTwo){
            throw new parametrosInvalidosException();
        }

        int repetitions = numberTwo - numberOne;

        for(int i = 1; i <= repetitions; i++){
            System.out.printf("Printing number %d. %n", i);
        }
    }
}
