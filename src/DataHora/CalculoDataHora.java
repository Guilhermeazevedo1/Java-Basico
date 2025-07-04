package DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
    public static void main(String[] args) {
        LocalDate data = LocalDate.parse("2025-07-04");
        LocalDateTime dataHora = LocalDateTime.parse("2025-07-04T17:19:50");
        Instant dataHoraGlobal = Instant.parse("2025-07-04T17:19:50Z");

        //soma ou subtrai os dias LocalDate
        LocalDate semanaAnteriorLocalData = data.minusDays(7);
        LocalDate proximaSemanaLocalData = data.plusDays(7);

        System.out.println("LocalDate semana anterior = " + semanaAnteriorLocalData);
        System.out.println("LocalDate proxima semana = " + proximaSemanaLocalData);

        System.out.println();
        //soma ou subtrai os dias LocalDateTime
        LocalDateTime semanaAnteriorLocalDataTime = dataHora.minusDays(7);
        LocalDateTime proximaSemanaLocalDataTime = dataHora.plusDays(7);

        System.out.println("LocalDateTime semana anterior = " + semanaAnteriorLocalDataTime);
        System.out.println("LocalDateTime proxima semana = " + proximaSemanaLocalDataTime);

        System.out.println();
        //soma ou subtrai os dias Instant
        Instant semanaAnteriorInstant = dataHoraGlobal.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = dataHoraGlobal.plus(7, ChronoUnit.DAYS);

        System.out.println("Instant semana anterior = " + semanaAnteriorInstant);
        System.out.println("Instant próxima semana = " + proximaSemanaInstant);

        // vê o tempo entre uma data e outra, só funciona para localdatetime, se quiser usar localdate tem que converter para datetime
        Duration tempo1 = Duration.between(semanaAnteriorLocalDataTime, dataHora);
        Duration tempo2 = Duration.between(semanaAnteriorLocalData.atTime(0,0), data.atTime(0,0));
        //também pode ser convertido dessa maneira abaixo
        //Duration tempo2 = Duration.between(semanaAnteriorLocalData.atStartOfDay(), data.atStartOfDay());
        System.out.println("LocalDateTime Dias: " + tempo1.toDays());
        System.out.println("LocalDate Dias: " + tempo2.toDays());

        //agora diminuindo o tempo
        Duration tempo3 = Duration.between(dataHoraGlobal, semanaAnteriorInstant);
        System.out.println("Instant Dias: " + tempo3.toDays());

    }
}
