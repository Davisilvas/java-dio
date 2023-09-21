package Set.PesquisaSet.Exercicio;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Trocar agua da Doly");
        lista.adicionarTarefa("Dar racao pra godinha");
        lista.adicionarTarefa("Arrumar a cozinha");

        System.out.println();
        lista.exibirTarefas();
        System.out.println();

        int numeroDeTarefas = lista.contarTarefas();
        System.out.println("Número de Tarefas na lista = " + numeroDeTarefas);
        System.out.println();

        lista.marcarTarefaConcluida("Trocar agua da Doly");
        lista.exibirTarefas();
        System.out.println();

        Set<Tarefa> concluidas = lista.obterTarefasConcluidas();
        System.out.println("Lista de Tarefas concluidas = " + concluidas);
        System.out.println();

        Set<Tarefa> pendentes = lista.obterTarefasPendentes();
        System.out.println("Lista de Tarefas pendentes = " + pendentes);
        System.out.println();

        System.out.println("Limpando o a lista.");
        lista.limparListaTarefas();
        lista.exibirTarefas();

    }
}
