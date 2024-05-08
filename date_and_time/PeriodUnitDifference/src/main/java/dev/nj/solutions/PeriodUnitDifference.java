package dev.nj.solutions;

import java.time.Period;
import java.util.Comparator;
import java.util.List;

public class PeriodUnitDifference {
    private static final int YY = 365;
    private static final int MM = 30;

    public static Period getSumMinusMin(List<Period> periods) {
        Period sum = periods.stream()
                .reduce(Period::plus)
                .orElse(Period.of(0, 0, 0));
        Period min = periods.stream()
                .min(Comparator.comparingInt(PeriodUnitDifference::calculateDayCount))
                .orElse(Period.of(0, 0, 0));
        return sum.minus(min);
    }

    /**
     * Calculates days count in a Period unit.
     * Assumes there are no leap years and all months have 30 days
     */
    private static int calculateDayCount(Period p) {
        return p.getYears() * YY + p.getMonths() * MM + p.getDays();
    }
}
