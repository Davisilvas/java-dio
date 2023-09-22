package Set.OrdenacaoEmSet.Exercicio;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos alunosSet = new GerenciadorAlunos();

        alunosSet.adicionarAluno("Davi", 1998L, 77.7);
        alunosSet.adicionarAluno("Maria", 1000L, 10.0);
        alunosSet.adicionarAluno("Doly", 2009L, 95.5);

        System.out.println();
        alunosSet.exibirAlunos();
        System.out.println();

        // alunosSet.exibirAlunosPorNome();
        //System.out.println();

        System.out.println("ORDENACAO POR NOTA");
        alunosSet.exibirAlunosPorNota();
        System.out.println();

        alunosSet.removerAluno(2009L);
        alunosSet.exibirAlunos();


    }
}
