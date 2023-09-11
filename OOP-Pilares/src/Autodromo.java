public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto kawasakiNinja = new Moto();

        kawasakiNinja.setChassi("0001");
        jeep.setChassi("0002");

        jeep.ligar();
        kawasakiNinja.ligar();

        /*
         *  Polimorfismo
         *  Veiculo coringa = jeep;
         *  coringa.ligar();
         */
    }
}
