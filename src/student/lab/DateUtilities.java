/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alancerio18
 * dateUtility class
 */
public class DateUtilities {

    public static void main(String[] args) throws ParseException {
        String format = "M/d/yy h:mm:ss a";
        DateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);

        String dateString = "1/1/16 0:00:00 am";
        Date date1 = sdf.parse(dateString);
        sdf.format(date1);
        System.out.println(date1);

        Date todayDate = Calendar.getInstance().getTime();
        String reportDate = df.format(todayDate);
        System.out.println("Today's date: " + reportDate);
        
        String d = sdf2.format(todayDate);
        System.out.println("Format 2 " + reportDate);
         
        
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime changedDay = today.plusDays(15);
        System.out.println(changedDay);
    }
}
