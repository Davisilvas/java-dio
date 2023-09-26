package Map.OperacoesBasicas.Exercicio;

public class Main {
    public static void main(String[] args) {
        Dicionario teste = new Dicionario();

        System.out.println();
        teste.exibirPalavras();
        System.out.println();

        teste.adicionarPalavra("Cachorro", "Animal domesticado");
        teste.adicionarPalavra("Carro", "Meio de transporte");
        teste.adicionarPalavra("mouse", "Periférico de uso no computador");

        teste.exibirPalavras();
        System.out.println();

        teste.removerPalavra("Carro");
        System.out.println();

        teste.exibirPalavras();
        System.out.println();

        String defPalavra = teste.pesquisaPorPalavra("Cachorro");
        System.out.println(defPalavra);
    }
}
