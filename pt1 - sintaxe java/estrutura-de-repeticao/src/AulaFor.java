public class AulaFor {
    public static void main(String[] args) {
        for (int x = 0; x <= 20; x++){
            System.out.printf("Contando. x = %d%n", x);
        }

        System.out.println();
        
        for(int i = 0; i <=10; i++){
            if(i % 2 != 0)
                continue;
            
            System.out.println(i);
        }
    }
}
