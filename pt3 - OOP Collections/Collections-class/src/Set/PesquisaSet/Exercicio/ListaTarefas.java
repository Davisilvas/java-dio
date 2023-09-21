package Set.PesquisaSet.Exercicio;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> toDoList;

    public ListaTarefas() {
        this.toDoList = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        toDoList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!toDoList.isEmpty()){
            for (Tarefa t : toDoList){
                if (t.getDescricao() == descricao){
                    tarefaParaRemover = t;
                }
            }
            toDoList.remove(tarefaParaRemover);
        } else {
            throw new RuntimeException("A lista de tarefas se encontra vaiza.");
        }
    }

    public void exibirTarefas(){
        System.out.println(toDoList);
    }

    public int contarTarefas(){
        int qtdTarefas = 0;
        for (Tarefa t : toDoList){
            qtdTarefas ++;
        }
        return qtdTarefas;
    }

    public void marcarTarefaConcluida(String descricao){
        if (!toDoList.isEmpty()){
            for (Tarefa t : toDoList){
                if (t.getDescricao() == descricao){
                    t.setDone(true);
                }
            }
        } else {
            throw new RuntimeException("A lista está vaiza.");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluidas = new HashSet<>();
        if(!toDoList.isEmpty()){
            for (Tarefa t : toDoList){
                if (t.isDone()){
                    concluidas.add(t);
                }
            }
            return concluidas;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> pendentes = new HashSet<>();
        if(!toDoList.isEmpty()){
            for (Tarefa t : toDoList){
                if (!t.isDone()){
                    pendentes.add(t);
                }
            }
            return pendentes;
        } else {
            throw new RuntimeException("A lista está vaiza.");
        }
    }

    public void limparListaTarefas(){
        if (toDoList.isEmpty()){
            System.out.println("A lista de tarefas está vazia.");
        } else {
            toDoList.clear();
        }
    }
}
