package AulaPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {
    public static void main(String[] args) {

        //retorna um boolean -> usada para filtrar os elementos com base numa condition.
        // colect pra coletar e colocar dentro de algo.

        List<String> palavras = Arrays.asList("C#", "Pearl", "Kotlin", "Java", "Typescript", "Python");

        Predicate <String> maisDeCincoLetras = palavra -> palavra.length() > 5;

        palavras.stream()
            .filter(maisDeCincoLetras)
            .forEach(System.out::println);
    }
}
