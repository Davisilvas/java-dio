package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCadidato(1850.0);
        analisarCadidato(2000.0);
        analisarCadidato(2200.0);
    }

    
    
    /**
     * METHOD analisarCandidato.
     * @param expectedSalary -> this value represents the amount that the candidate wishes to have as his salary.
     * this method will help sorting candidates. This method separetes into higher base salary, equal base salary and lower than base salary.
     */
    
    static void analisarCadidato(double expectedSalary){
        
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
