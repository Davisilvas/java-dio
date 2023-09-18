package list.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List <Integer> numeroInteiro;

    public SomaNumeros () {
        this.numeroInteiro = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroInteiro.add(numero);
    }

    public int calcularSoma(){
        int resultado = 0;
        if (!numeroInteiro.isEmpty()){
            for (int i : numeroInteiro){
                resultado += i;
            }
            return resultado;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeroInteiro.isEmpty()){
            for (Integer i : numeroInteiro){
                if (i >= maiorNumero){
                    maiorNumero = i;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeroInteiro.isEmpty()){
            for (Integer i : numeroInteiro){
                if ( i <= menorNumero){
                    menorNumero = i;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirNumeros () {
        /*
            if (!numeroInteiro.isEmpty()){
                System.out.println(numeroInteiro);
            } else {
                throw new RuntimeException("A lista está vazia.");
            }
         */
        System.out.println(numeroInteiro);
    }


}
