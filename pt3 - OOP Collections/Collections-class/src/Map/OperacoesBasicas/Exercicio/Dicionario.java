package Map.OperacoesBasicas.Exercicio;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        } else {
            throw new RuntimeException("O dicion ário se encontra vazio.");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisaPorPalavra(String palavra){
        String definicao = null;

        if (dicionarioMap.containsKey(palavra)){
            definicao = dicionarioMap.get(palavra);
            return "O vocábulo " + palavra +
                " tem como definição o seguinte -> " +
                definicao;
        } else {
            throw new RuntimeException("A palavra pesquisada não se encontra no dicionário.");
        }
    }
}
