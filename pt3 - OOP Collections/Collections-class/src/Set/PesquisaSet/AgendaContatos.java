package Set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void addContato (String nome, int numero){
        contatoSet.add(new Contato (nome, numero));
    }

    public void exibirContatos () {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome (String nome) {
        Set <Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
                if (c.getNome().startsWith(nome)){
                    contatosPorNome.add(c);
                }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato (String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContatos();

        // Adicionando contatos à agenda
        agendaContatos.addContato("João", 123456789);
        agendaContatos.addContato("Maria", 987654321);
        agendaContatos.addContato("Maria Loyola", 55555555);
        agendaContatos.addContato("Ana", 88889999);
        agendaContatos.addContato("Fernando", 77778888);
        agendaContatos.addContato("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();
        System.out.println();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}
