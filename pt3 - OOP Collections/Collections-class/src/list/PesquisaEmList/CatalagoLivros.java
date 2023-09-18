package list.PesquisaEmList;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoLancamento){
        livroList.add(new Livro (titulo, autor, anoLancamento));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                };
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        
    }

    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
        } else {
            System.out.println("A lista de Livros se encontra vazia.");
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroPorTitulo = l;
                break;
            }
            }
            return livroPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do catálogo de livros
        CatalagoLivros catalogoLivros = new CatalagoLivros();
    
        catalogoLivros.adicionarLivro("Livro a", "A1", 1990);
        catalogoLivros.adicionarLivro("Livro b", "A1", 1992);
        catalogoLivros.adicionarLivro("Livro c", "B2", 1994);
        catalogoLivros.adicionarLivro("Livro d", "C3", 1996);
        catalogoLivros.adicionarLivro("Livro a", "C3", 1999);


    
        System.out.println(catalogoLivros.pesquisarPorAutor("A1"));
        System.out.println();

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1991, 1995));
        System.out.println();

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro a"));
        System.out.println();

    }
}