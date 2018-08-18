package com.dbs.main;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class mainEntrance {

    public static void main(String[] args)
    {
        System.out.println("Heeloooo! My World");
        String birthDate = "11/11/1981 12:00:00 AM";
        String currentDate = "18/08/2018 17:58:00 PM";

        Date d1 = null;
        Date d2 = null;

        LocalDate start = LocalDate.of(1986,1,1);
        LocalDate end = LocalDate.of(2018,1,1);

        long diffInYears = ChronoUnit.YEARS.between(start,end);
        long diffInMonths =  ChronoUnit.MONTHS.between(start,end);
        long diffInDays = ChronoUnit.DAYS.between(start,end);

        System.out.println(diffInYears);
        System.out.println(diffInMonths);
        System.out.println(diffInDays);

    }
}
