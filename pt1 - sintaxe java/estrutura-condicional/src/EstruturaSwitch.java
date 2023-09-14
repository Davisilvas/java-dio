public class EstruturaSwitch {
    public static void main(String[] args) {
        String sigla = "T";

        switch(sigla){
            case "P":{
                System.out.println("Pequeno.");
                break;
            }

            case "M":{
                System.out.println("Pequeno.");
                break;
            }

            case "G":{
                System.out.println("Pequeno.");
                break;
            }

            default:
                System.out.println("Indefinido");
        }

        System.out.println("--------------------------------------------");

        switch(sigla){
            case "T":
                System.out.println("+ 5GB de Youtube");
            
            case "M": 
                System.out.println("+ Whats e Instagram grátis");
            
            case "B" :
                System.out.println("100 minutos de ligação");
        }
    }
}
