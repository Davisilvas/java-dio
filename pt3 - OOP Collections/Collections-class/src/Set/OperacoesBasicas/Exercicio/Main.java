package Set.OperacoesBasicas.Exercicio;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjPalavras = new ConjuntoPalavrasUnicas();

        conjPalavras.adicionarPalavra("Maçã");
        conjPalavras.adicionarPalavra("Celular");
        conjPalavras.adicionarPalavra("Maçã");
        conjPalavras.adicionarPalavra("Grampeador");
        conjPalavras.adicionarPalavra("Pneu");

        System.out.println();
        conjPalavras.exibirPalavrasUnicas();
        System.out.println();

        conjPalavras.removerPalavra("Pneu");
        conjPalavras.exibirPalavrasUnicas();
        System.out.println();

        System.out.println("Vendo Se pneu ainda está no SET");
        System.out.println(conjPalavras.verificarPalavra("Pneu"));
        System.out.println();

        System.out.println("Vendo Se maçã ainda está no SET");
        System.out.println(conjPalavras.verificarPalavra("Celular"));
        System.out.println();

        conjPalavras.exibirPalavrasUnicas();

    }
}
