import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    static TreeMap<LocalDate, Evento> listaEventos = new TreeMap<>();

    public static void main(String[] args) {

    }

    static void adicionarEvento(LocalDate data, String nome, String atracao) {
        listaEventos.put(data, new Evento(nome, atracao));
    }

    static void exibirAgenda() {
        System.out.println(listaEventos);
    }

    static Evento obterProximoEvento() {
        LocalDate proxData;
        for (Map.Entry<LocalDate, >) {

        }
    }

}