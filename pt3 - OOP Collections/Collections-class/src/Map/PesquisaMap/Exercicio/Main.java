package Map.PesquisaMap.Exercicio;

public class Main {
    public static void main(String[] args) {
        ContagemPalavras teste = new ContagemPalavras();

        teste.adicionarPalavra("C#", 2);
        teste.adicionarPalavra("Java", 6);
        teste.adicionarPalavra("JavaScript", 3);
        teste.adicionarPalavra("Python", 1);

        int contagem = teste.exibirContagemPalavras();
        System.out.println();
        System.out.println(contagem);
        System.out.println();

        String maisFrequente = teste.encontrarPalavraMaisFrequente();
        System.out.println(maisFrequente);
        System.out.println();

        teste.removerPalavra("Python");
        contagem = teste.exibirContagemPalavras();
        System.out.println(contagem);


    }
}
