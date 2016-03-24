/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alancerio18
 */
public class DateUtilities {

    public static void main(String[] args) throws ParseException {
        String format = "M/d/yy h:mm:ss a";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);

        String dateString = "1/1/16 0:00:00 am";
        Date date1 = sdf.parse(dateString);
        sdf.format(date1);
        System.out.println(date1);

        Date todayDate = Calendar.getInstance().getTime();
        String reportDate = df.format(todayDate);
        System.out.println("Today's date: " + reportDate);
        
        Calendar date2 = Calendar.getInstance();
        System.out.println("Current " + df.format(date1.getTime()));
        date2.add(Calendar.DATE, 10);
        System.out.println("10 days adding "+ df.format(date2.getTime()));
    }
}
