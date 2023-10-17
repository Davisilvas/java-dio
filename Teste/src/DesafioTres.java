import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {
    private int senha;
    
    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        if (confirmacaoSenha == this.senha){
            return true;
        }
        return false;
    }
}

class CofreFisico extends Cofre {
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }      
}

public class DesafioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")){
            int senha = scanner.nextInt();
            CofreDigital cofre = new CofreDigital(senha);

            int validarSenha = scanner.nextInt();
            boolean tentativa = cofre.validarSenha(validarSenha);

            cofre.imprimirInformacoes();
            if (tentativa) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }


            

        } else {
            CofreFisico cofre = new CofreFisico();
            cofre.imprimirInformacoes();
        }
    }
}