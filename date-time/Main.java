import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        LocalTime myTime = LocalTime.now();
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDate);
        System.out.println(myTime);
        System.out.println(myDateTime);

        DateTimeFormatter myFormattedDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = myDateTime.format(myFormattedDate);
        System.out.println(formattedDate);


    }
}
