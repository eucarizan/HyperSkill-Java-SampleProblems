import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AllMondays {
    static final int MONTH = 12;
    static final int YEAR = 10000;

    public static List<String> find(int year,int month) {
        if (year <= 0 || month <= 0) {
            return List.of();
        }

        if (month > 12) {
            int months = month / 12;
            year += months;
        }

        LocalDate startDate = LocalDate.parse(String.format("%04d-%02d-01", year % YEAR, month <= 12 ? month : month % MONTH));
        LocalDate endDate = LocalDate.of(year % YEAR, month <= 12 ? month : month % MONTH, startDate.lengthOfMonth());
        List<String> dates = new ArrayList<>();

        while (!"MONDAY".equals(startDate.getDayOfWeek().toString())) {
            startDate = startDate.plusDays(1);
        }

        for (LocalDate date = startDate; date.isBefore(endDate);) {
            dates.add(date.toString());
            date = date.plusDays(7);
        }

        return dates;
    }

    public static List<String> findStream(int year, int month) {
        if (month > 12) {
            int months = month / 12;
            year += months;
            month = month % 12;
        }

        LocalDate start = LocalDate.of(year, month, 1);

        return start.datesUntil(start.plusMonths(1))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.MONDAY)
                .map(String::valueOf)
                .toList();
    }
}
