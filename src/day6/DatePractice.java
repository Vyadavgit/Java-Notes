package day6;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Logger;

public class DatePractice {

    public static void main(String[] args) {
        //Current
        Date date = new Date();
        Logger.getGlobal().info(String.valueOf(date));

        //Current
        LocalDate localDate = LocalDate.now();
        Logger.getGlobal().info(String.valueOf(localDate));

        //Current
        LocalTime localTime = LocalTime.now();
        Logger.getGlobal().info(String.valueOf(localTime));

        //Current
        LocalDateTime localDateTime = LocalDateTime.now();
        Logger.getGlobal().info(String.valueOf(localDateTime));

        //Formatting
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a");
        String formattedDate = dateFormatter.format(localDateTime);
        Logger.getGlobal().info(formattedDate);

        //Current
        Calendar calendar = Calendar.getInstance();
        Logger.getGlobal().info(String.valueOf(calendar));

        //Specific
        Calendar specificCalendar = Calendar.getInstance();
        specificCalendar.set(Calendar.YEAR, 1993);
        specificCalendar.set(Calendar.MONTH, 12);
        specificCalendar.set(Calendar.DAY_OF_MONTH, 7);
        Logger.getGlobal().info(String.valueOf(specificCalendar));
    }
}