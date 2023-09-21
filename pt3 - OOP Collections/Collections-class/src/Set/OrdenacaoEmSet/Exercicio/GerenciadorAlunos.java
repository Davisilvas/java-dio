package Set.OrdenacaoEmSet.Exercicio;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Aluno alunoASerRemovido = null;
        if(!alunos.isEmpty()){
            for (Aluno a : alunos){
                if (a.getMatricula() == matricula){
                    alunoASerRemovido = a;
                    break;
                }
            }
            alunos.remove(alunoASerRemovido);
        } else {
            throw new RuntimeException("A Lista de alunos está vazia");
        }

        if( alunoASerRemovido == null ){
            System.out.println("Matricula não encontrada.");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunos);
    }
}

/*
 * TODO 
 * Ainda tenho que implementar os métodos
 * -> exibirAlunosPorNome()
 * -> exibirAlunosPorNota()
 */
