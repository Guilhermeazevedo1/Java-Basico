package DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {
        //pega a data do sistema
        LocalDate date = LocalDate.now();
        //pega a hora e a data
        LocalDateTime dateTime = LocalDateTime.now();
        //instant pega a hora global gmt do horario de londres
        Instant dateGlobal = Instant.now();
        //data ISO 8601 - você define uma data, ano, mês e dia
        LocalDate dataIso = LocalDate.parse("2025-07-04");
        //data hora ISO 8601 - você define uma data, ano, mês, dia, hora, minuto, segundo, milisegundo
        LocalDateTime dataHoraIso = LocalDateTime.parse("2025-07-04T15:44:50");
        // data hora ISO 8601 - você define uma data, ano, mês, dia, hora, minuto, segundo, milisegundo no padrão UTC horário de londre
        Instant dataHoraIsoUTC = Instant.parse("2025-07-04T15:44:50Z");
        // data hora ISO 8601 para pegar o horário local - você define uma data, ano, mês, dia, hora, minuto, segundo, milisegundo no padrão UTC horário de londres especificando o timezone
        Instant dataHoraIsoUTCLocal = Instant.parse("2025-07-04T15:44:50-03:00");

        //texto no formato customizado data hora Brasil
        //usar o datatimeformatter para formatar como você quer representar a data
        DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataTexto = LocalDate.parse("04/07/2025", fmtData);
        //com data e hora agora
        DateTimeFormatter fmtDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHoraTexto = LocalDateTime.parse("04/07/2025 16:15", fmtDataHora);

        // passar o localdate com dia, mêd e ano isoladamente
        LocalDate data = LocalDate.of(2025, 7, 20);
        LocalDateTime dataHora = LocalDateTime.of(2025, 7, 04, 16, 19);

        // Formatação, passar de data hora para texto em um formato customizado usando barras e passando o farmato no sout
       DateTimeFormatter fmtCustomizadoData =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate dataBarras = LocalDate.parse("2025-07-04");
       DateTimeFormatter fmtCustomizadoDataHora =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       LocalDateTime dataHoraBarras = LocalDateTime.parse("2025-07-04T16:23");
       // Agora fazendo o customizado para o Instant padrão UTC pode passar o valor ou o withZone(ZoneId.systemDefault() que vai pegar por padrão a data hora local do sistema
        DateTimeFormatter fmtCustomizadoDataHoraInstant =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        Instant instantCustomizadoLocal = Instant.parse("2025-07-04T16:32:10Z");

        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(dateGlobal);
        System.out.println(dataIso);
        System.out.println(dataHoraIso);
        System.out.println(dataHoraIsoUTCLocal);
        System.out.println(dataTexto);
        System.out.println(dataHoraTexto);
        System.out.println(data);
        System.out.println(dataHora);
        System.out.println(dataBarras.format(fmtCustomizadoData));
        System.out.println(dataHoraBarras.format(fmtCustomizadoDataHora));
        //para o instant ele não tem o format, então você passa o valor do datetimeformat e colocar o ponto format e passa a variavel instant
        System.out.println(fmtCustomizadoDataHoraInstant.format(instantCustomizadoLocal));
    }
}
