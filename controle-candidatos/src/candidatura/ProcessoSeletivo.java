package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidates = {"Davi", "Maria", "Doly", "Nina", "Tom", "Mila", "Princesa"};
        for(String candidate : candidates){
            gettingInTouch(candidate);
        }
    }

    static void gettingInTouch(String candidate){
        int attempts = 1;
        boolean keepTrying = true;
        boolean answered = false;

        do{
            answered = answerTheCall();
            keepTrying = !answered;

            if(keepTrying){
                attempts++;
            }else{
                System.out.println("The candidate answerd the call.");
            }

        } while(keepTrying && attempts <= 3);

        if(answered){
            System.out.printf("We achieved contact with %s at %d attempt. %n", candidate, attempts);
        }else{
            System.out.printf("We couldn't get in touch with %s. We achived our limit of attempts %d.%n", candidate, attempts);
        }

    }
    
    static boolean answerTheCall(){
       return new Random().nextInt(3)==1;
    }

    static void printSelectedCandidates(){
        String [] candidates = {"Davi", "Maria", "Doly", "Nina", "Tom", "Mila", "Princesa"};

        System.out.println("Imprimindo candidatos selecionados");

        for(int i = 0; i < candidates.length; i++){
            System.out.printf("The Candidate number %d is %s%n", (i + 1), candidates[i]);
        }
    }
    
    static void pickingCandidates(){
        String [] candidates = {"Davi", "Maria", "Doly", "Nina", "Tom", "Mila", "Princesa", "Thor", "Luke", "Tânia", "Artur", "Pedro", "Happy", "Jerry"};

        double baseSalary = 2000.0;
        int selectedCandidates = 0;
        int actualCandidate = 0;

        while (selectedCandidates < 5 && actualCandidate < candidates.length){
            String candidate = candidates[actualCandidate];
            double expectedSalary = randomExpectedSalary();

            System.out.printf("The candidate %s requested the following value for his salary %.2f%n", candidate, expectedSalary);
            
            if(baseSalary >= expectedSalary){
                System.out.printf("**The candidate %s was selected for the job.**%n", candidate);
                selectedCandidates++;
            }

            actualCandidate++;
        }
    }

    static double randomExpectedSalary(){
        return ThreadLocalRandom.current().nextDouble(1850.0, 2200.0);
    }
    
    static void analyzingCandidate(double expectedSalary){
        double baseSalary = 2000.0;
        if(baseSalary > expectedSalary){
            System.out.println("Call to the candidate.");
        }else if(baseSalary == expectedSalary){
            System.out.println("Call with a counter-proposal to the candidate.");
        }else{
            System.out.println("Waiting the results of others candidates.");
        }
    }
}
