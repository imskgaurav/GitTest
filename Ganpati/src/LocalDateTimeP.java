import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeP {


    ///https://www.baeldung.com/current-date-time-and-timestamp-in-java-8
    public static void main(String[] args) {
        
        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("UTC"));

        System.out.println(ldt);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy HH_mm");

         String formattedDate=ldt.format(formatter);
         System.out.println(formattedDate);

        
    }
    
}
