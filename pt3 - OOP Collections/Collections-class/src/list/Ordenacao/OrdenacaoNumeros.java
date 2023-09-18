package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    
    private List <Integer> numbers;

    public OrdenacaoNumeros() {
        this.numbers = new ArrayList<>();
    }


    public void adicionarNumero (int numero) {
        numbers.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordenadoAscendente = new ArrayList<>(this.numbers);
        if(!numbers.isEmpty()){
            Collections.sort(ordenadoAscendente);
            return ordenadoAscendente;
        } else {
            throw new RuntimeException(" A lista está vazia. ");
        }
    }

    public List <Integer> ordenarDescendente () {
        List <Integer> ordenadosDescendente = new ArrayList<>(this.numbers);
        if (!numbers.isEmpty()){
            ordenadosDescendente.sort(Collections.reverseOrder());
            return ordenadosDescendente;
        } else {
            throw new RuntimeException(" Esta Lista está vazia. ");
        }
    }

    public void exibirLista () {
        System.out.println(this.numbers);
    }

    @Override
    public String toString(){
        return "Lista " + this.numbers;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros  teste = new OrdenacaoNumeros();

        teste.adicionarNumero(1);
        teste.adicionarNumero(15);
        teste.adicionarNumero(5);
        teste.adicionarNumero(22);

        System.out.println("----------------");
        List <Integer> ascendente = teste.ordenarAscendente();
        System.out.println(ascendente);
        System.out.println();

        List <Integer> descendente = teste.ordenarDescendente();
        System.out.println(descendente);
        System.out.println();

        System.out.println("ORIGINAL");
        System.out.println(teste);
    }

}
