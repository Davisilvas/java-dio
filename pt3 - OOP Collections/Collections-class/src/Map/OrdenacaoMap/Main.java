package Map.OrdenacaoMap;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 27), "Palestra na SEMUS", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 21), "Corrida ecológica", "Usain Bolt");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 5), "Show", "Posty");

        System.out.println();
        agendaEventos.exibirAgenda();

        System.out.println();
        agendaEventos.obterProximoEvento();
    }
}
