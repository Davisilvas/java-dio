package Set.OperacoesBasicas.Exercicio;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraParaRemover = null;
        if(!palavras.isEmpty()){
            for (Palavra p : palavras){
                if (p.getPalavra() == palavra){
                    palavraParaRemover = p;
                    break;
                }
            }
            palavras.remove(palavraParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio.");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavras);
    }
}
