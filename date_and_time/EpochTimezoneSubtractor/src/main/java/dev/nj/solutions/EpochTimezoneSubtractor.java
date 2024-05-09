package dev.nj.solutions;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class EpochTimezoneSubtractor {
    public static ZonedDateTime subtractFromEpoch(int days, String zone) {
        return Instant.EPOCH.minus(days, ChronoUnit.DAYS).atZone(ZoneId.of(zone));
    }
}
