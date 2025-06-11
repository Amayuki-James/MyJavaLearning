package JavaClasses;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateNTime {
    public static void main(String[] args){
        LocalDate date = LocalDate.now(); // Get the current date
        LocalTime time = LocalTime.now(); // Get the current time
        LocalDateTime dateTime = LocalDateTime.now(); // Get the current date and time
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("Date and Time: " + dateTime);
        // The result above are Date and Time before formatting
        // We can format the date and time using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = date.format(formatter);
        String formattedTime = time.format(formatter);
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Formatted Time: " + formattedTime);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
