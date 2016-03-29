/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *
 * @author alancerio18
 */
public class challenges {
    //challenge 1
    
    public static void main(String[] args) {
                DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);

//        SimpleDateFormat format = new SimpleDateFormat("mm/dd/yyyy");
//        Date myDefaultDate = fomrat.parse("1/1/1753");
//        
//        
//    LocalDate today = LocalDate.now();
//  //  LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth(DayOfWeek.FRIDAY));
//  //System.out.println(lastDay.getDayOfMonth());
//        
//         LocalDate today2 = LocalDate.now();
//        LocalDate lastBusDay = today2.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY));
//        System.out.println(lastBusDay.getDayOfMonth());
       
//        Calendar localTime = Calendar.getInstance();
//        localTime.set(Calendar.HOUR,17);
//        localTime.set(Calendar.MINUTE, 15);
//        localTime.set(Calendar.SECOND, 20);
//
//        int hour = localTime.get(Calendar.HOUR);
//        int minute = localTime.get(Calendar.MINUTE);
//        int second = localTime.get(Calendar.SECOND);
//
//        Date todayDate = Calendar.getInstance().getTime();
//        String reportDate = df.format(todayDate);
//        System.out.println("Today's date: " + reportDate);
//
//       
//        Calendar germanyTime = new GregorianCalendar(TimeZone.getTimeZone("Europe/Berlin"));
//        germanyTime.setTimeInMillis(reportDate.getTimeInMillis());
//        hour = germanyTime.get(Calendar.HOUR);
//        minute = germanyTime.get(Calendar.MINUTE);
//        second = germanyTime.get(Calendar.SECOND);
//
//
//        System.out.printf("Germany time: %02d:%02d:%02d\n", hour, minute, second);
        
                
//        LocalDateTime now = LocalDateTime.now();
//        LocalDateTime dueDate = now.plusDays(15);
//        System.out.println(dueDate);
        LocalDateTime today = LocalDateTime.now();
        int now = LocalDateTime.now();
        while( !now.isleap(now))
            
    }
}
