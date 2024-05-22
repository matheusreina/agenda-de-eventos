import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    static TreeMap<LocalDate, Evento> listaEventos = new TreeMap<>();

    public static void main(String[] args) {
        // Adiciona eventos à agenda
        adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        exibirAgenda();

        System.out.println("--------------------------");

        // Obtém e exibe o próximo evento na agenda
        obterProximoEvento();
    }

    static void adicionarEvento(LocalDate data, String nome, String atracao) {
        listaEventos.put(data, new Evento(nome, atracao));
    }

    static void exibirAgenda() {
        for (Map.Entry<LocalDate, Evento> entry : listaEventos.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            String returnString = "{ "+dataEvento.getDayOfMonth()+"/"+dataEvento.getMonthValue()+"/"+dataEvento.getYear()+" |"+entry.getValue().toString();
            System.out.println(returnString);
        }
    }

    static void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : listaEventos.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                proximaData = dataEvento;
                proximoEvento = entry.getValue();
                break;
            }
        }
        if (proximoEvento == null) {
            System.out.println("Não há eventos futuros na agenda.");
        } else {
            System.out.println("Próximo evento: '" + proximoEvento.getNome() + "', acontecerá no dia " + proximaData.getDayOfMonth()+"/"+proximaData.getMonthValue()+"/"+proximaData.getYear());
        }

    }

}