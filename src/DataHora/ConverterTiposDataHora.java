package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConverterTiposDataHora {
    public static void main(String[] args) {
        LocalDate data = LocalDate.parse("2025-07-04");
        LocalDateTime dataHora = LocalDateTime.parse("2025-07-04T17:19:50");
        Instant dataHoraGlobal = Instant.parse("2025-07-04T17:19:50Z");

        // converte a data global do Instant para a data hora do computador
        LocalDate resultado1 = LocalDate.ofInstant(dataHoraGlobal, ZoneId.systemDefault());
        //converte para um lugar específico exemplo usado foi portugal
        LocalDate resultado2 = LocalDate.ofInstant(dataHoraGlobal, ZoneId.of("Portugal"));
        //Converte a data hora global para a data hora do computador ou especifico
        LocalDateTime resultado3 = LocalDateTime.ofInstant(dataHoraGlobal, ZoneId.systemDefault());
        LocalDateTime resultado4 = LocalDateTime.ofInstant(dataHoraGlobal, ZoneId.of("Portugal"));

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

        //Pega um valor específico do LocalDate
        System.out.println("Dia: " + data.getDayOfMonth());
        System.out.println("Mês: " + data.getMonthValue());
        System.out.println("Ano: " + data.getYear());

        //Pega um valor específico do LocalDateTime
        System.out.println("Hora: " + dataHora.getHour());
        System.out.println("Minuto: " + dataHora.getMinute());
    }
}
