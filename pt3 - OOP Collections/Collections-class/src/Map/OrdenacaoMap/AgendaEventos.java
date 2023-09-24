package Map.OrdenacaoMap;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    private Map <LocalDate, Evento> eventosMap;

    public AgendaEventos () { this.eventosMap = new HashMap<>();}

    public void adicionarEvento (LocalDate date, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(date, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        
        for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                break;
            }
        }
        
        if (proximoEvento != null){
            System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
        } else {
            System.out.println("Não há eventos futuros na agenda.");
        }
    }
}
