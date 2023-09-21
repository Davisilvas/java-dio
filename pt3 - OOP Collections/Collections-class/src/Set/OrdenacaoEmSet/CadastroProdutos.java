package Set.OrdenacaoEmSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void addProduto (Long codigo, String nome, double preco, int qtd){
        produtoSet.add(new Produto(nome, codigo, preco, qtd));
    }

    public Set<Produto> exibirProdutosPorNome () {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco () {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        // Adicionando produtos ao cadastro
        cadastroProdutos.addProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.addProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.addProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.addProduto(4L, "Teclado", 50d, 15);
    
        // Exibindo todos os produtos no cadastro
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println();
    
        // Exibindo produtos ordenados por nome
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println();

    
        // Exibindo produtos ordenados por preço
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
