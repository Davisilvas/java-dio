package Map.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        System.out.println();
        agendaContatos.exibirContatos();
        System.out.println();

        agendaContatos.adicionarContato("Davi", 11111);
        agendaContatos.adicionarContato("Davi", 22222);
        agendaContatos.adicionarContato("Maria",11111);
        agendaContatos.adicionarContato("Doly", 33333);

        agendaContatos.exibirContatos();
        System.out.println();

        agendaContatos.removerContato("Doly");
        agendaContatos.exibirContatos();
        System.out.println();

        Integer numeroDavi = agendaContatos.pesquisarPorNome("Davi");
        System.out.println(numeroDavi);
    }
}
