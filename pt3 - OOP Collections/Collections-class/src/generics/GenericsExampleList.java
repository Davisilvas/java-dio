package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
    public static void main(String[] args) {
        // SEM USO DE GENERICS
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("String");
        listaSemGenerics.add(1);

        // COM USO DE GENERICS
        List<String>  listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1 - STR");
        listaGenerics.add("Elemento 2 - STR");

        // ITERANDO SOBRE LISTA COM GENERICS
        for (String element : listaGenerics){
            System.out.println(element);
        }

        // PARA ITERAR SEM O USO DE GENERICS, TEM QUE FAZER O CAST
        for (Object element : listaSemGenerics){
            String str = (String) element;
            System.out.println(str);
        }
    }
}
