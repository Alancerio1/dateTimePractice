/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author alancerio18
 */
public class SimpleDateTime {
    public static void main(String[] args) {
        //old way (Pre-JDK8)
        
        
        
        //not international
        Date date1 = new Date();
        System.out.println(date1);
        
                //get Date/Time long integer value
        long dateTimeValue = date1.getTime();
        System.out.println("Date Time Value " + dateTimeValue);
        
        //international old way still   
        Calendar date3 = Calendar.getInstance();
        System.out.println(date3);
        //bad practice don't do this
        date3.set(2020,2,22);
        System.out.println("Bad practice " + date3);
        
        
        
        
         //Good practice do this
        date3.set(2020,Calendar.MARCH,22);
        System.out.println("Good practice " + date3);
        
        
        
        //new way (JDK8)
        //international
        LocalDateTime date2 = LocalDateTime.now();
        System.out.println(date2);
        
        //date only new way
        LocalDate date4 = LocalDate.now();
        System.out.println(date4);
    }
}
