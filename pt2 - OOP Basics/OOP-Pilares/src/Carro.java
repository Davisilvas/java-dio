public class Carro extends Veiculo{
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Carro ligado.");
    }
    
    private void confereCombustivel(){
        System.out.println(" - Carro está com o tanque cheio.");
    }

    private void confereCambio(){
        System.out.println(" - Conferindo se o câmbio está em P.");
    }
}
