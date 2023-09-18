package list.SomaDeNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros teste = new SomaNumeros();
        SomaNumeros teste2 = new SomaNumeros();


        teste.adicionarNumero(1);
        teste.adicionarNumero(2);
        teste.adicionarNumero(3);
        teste.adicionarNumero(4);

        System.out.println("---------------------------");
        
        int soma = teste.calcularSoma();
        System.out.println(soma);
        System.out.println();

        int maiorOcorrencia = teste.encontrarMaiorNumero();
        System.out.println(maiorOcorrencia);
        System.out.println();

        int menorOcorrencia = teste.encontrarMenorNumero();
        System.out.println(menorOcorrencia);
        System.out.println();

        teste.exibirNumeros();
        teste2.exibirNumeros();
    }
}
