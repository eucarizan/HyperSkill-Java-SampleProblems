package dev.nj.solutions;

import java.time.Instant;

public class InstantToLong {
    public static long dateInEpochSecond(String text) {
        return Instant.parse(text).getEpochSecond();
    }
}
