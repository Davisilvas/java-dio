public class SistemaIbge{ 
    public static void main(String[] args) {
        for (EstadoBrasileiro e : EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " | " + e.getNomeMaiusculo());
        }

        System.out.println();

        EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
        System.out.println(eb);
    }
}