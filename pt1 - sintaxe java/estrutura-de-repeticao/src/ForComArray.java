public class ForComArray {
    public static void main(String[] args) {
        String nomes[] = {"Davi", "Maria", "Doly", "Nina"};

        for (int i = 0; i < nomes.length; i++){
            System.out.printf("O nome de índice %d é %s%n", i, nomes[i]);
        }

        System.out.println("--------------------------");
        System.out.println("FOREACH EM JAVA");

        for(String nome : nomes){
            System.out.printf("O nome é: %s%n", nome);
        }

    }
}
