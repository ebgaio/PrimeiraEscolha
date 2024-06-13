package com.valdonet.primeiraescolha.util;

import java.time.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // example with a hardcoded date:
        Date date = new Date();
        LocalDateTime ldt = convertToLocalDateTime(date);

        ldt = ldt.plusHours(5);

        System.out.println("Difference in seconds: " + calculateDifferenceInSeconds(ldt));
    }

    // method for conversion Date to LocalDateTime
    public static LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    // method for calculating difference in seconds
    public static long calculateDifferenceInSeconds(LocalDateTime ldt) {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(ldt, now);
        return Math.abs(duration.getSeconds());
    }
}
