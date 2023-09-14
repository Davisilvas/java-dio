public class CondicaoTernaria {
    public static void main(String[] args) {
        double minimunValue = 20.0;
        double value = 99.0;

        String withdraw = value >= minimunValue? "Saque possível" : "Saque impossível.";

        System.out.println(withdraw);

        System.out.println("***********************");

        int grade = 6;

        String finalResult = grade >= 7 ? "Aprovado" :
            grade >= 5 && grade < 7 ? "Recuperação" :
            "Reprovado"; 
        
        System.out.println(finalResult);
    }
}

