package Map.OrdenacaoMap.Exercicio;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LivrariaOnline teste = new LivrariaOnline();

        teste.adicionarLivro("LinkTeste1", "Livro 1", "Autor1", 58.99);
        teste.adicionarLivro("LinkTeste2", "Livro 2", "Autor1", 25.90);
        teste.adicionarLivro("LinkTeste3", "Livro 3", "Autor2", 79.90);
        teste.adicionarLivro("LinkTeste4", "Livro 4", "Autor3", 124.90);

        System.out.println();
        System.out.println("Exibindo livros por preço");
        Map<String, Livro> ordPreco = teste.exibirLivrosOrdenadosPorPreco();
        System.out.println(ordPreco);

        System.out.println();
        System.out.println("exibindo livors por autor");
        Map<String, Livro> ordAutor = teste.exibirLivrosOrdenadosPorAutor();
        System.out.println(ordAutor);

        System.out.println();
        List<Livro> maisCaro = teste.obterLivroMaisCaro();
        System.out.println(maisCaro);

        System.out.println();
        List<Livro> maisBarato = teste.obterLivroMaisBarato();
        System.out.println(maisBarato);

        System.out.println();
        Map<String, Livro> pesquisa = teste.pesquisarLivrosPorAutor("Autor1");
        System.out.println(pesquisa);

        teste.removerLivro("Livro 3");
        System.out.println();
        Map<String, Livro> maisCaro2 = teste.exibirLivrosOrdenadosPorPreco();
        System.out.println(maisCaro2);
    }
}
