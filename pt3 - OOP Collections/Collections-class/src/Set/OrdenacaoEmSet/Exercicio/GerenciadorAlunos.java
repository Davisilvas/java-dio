package Set.OrdenacaoEmSet.Exercicio;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!alunos.isEmpty()){
            alunosPorNota.addAll(alunos);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        if (!alunos.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }
}
