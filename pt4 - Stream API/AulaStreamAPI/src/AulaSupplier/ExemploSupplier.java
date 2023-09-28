package AulaSupplier;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ExemploSupplier {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá seja bem vindo(a)";

        /*
         * List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)")
         *      .limit(5)
         *      .toList();
        */
        
        List<String> listaSaudacoes = Stream.generate(saudacao)
            .limit(5)
            .toList();

        //listaSaudacoes.forEach(s -> System.out.println(s));
        listaSaudacoes.forEach(System.out::println);

    }
}
