package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    } 

    public void addConvidado (String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite (int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados () {
        return convidadosSet.size();
    }

    public void exibirConvidados () {
        System.out.println(convidadosSet);
    }

    

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        
        System.out.println();

        conjuntoConvidados.addConvidado("Alice", 1234);
        conjuntoConvidados.addConvidado("Bob", 1235);
        conjuntoConvidados.addConvidado("Charlie", 1235);
        conjuntoConvidados.addConvidado("David", 1236);

        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();
        System.out.println();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
        System.out.println();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }
}
