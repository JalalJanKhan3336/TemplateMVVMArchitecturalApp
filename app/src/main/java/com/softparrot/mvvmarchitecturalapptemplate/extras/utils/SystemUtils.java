package com.softparrot.mvvmarchitecturalapptemplate.extras.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SuppressLint("SimpleDateFormat")
public class SystemUtils {

    private SystemUtils(){}

    // End Point: Get System's Current Time & Returns it in 12 (AM/PM) or 24 Format
    public static String getCurrentTime(boolean is24Format){

        String format = "HH:mm:ss"; // will show 24 hour format (0 to 23)

        if(!is24Format)
            format = "hh:mm:ss a"; // will show 12 hour format with AM / PM

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(calendar.getTime());
    }

    // End Point: Get System's Current Day with Date & Returns it
    public static String getCurrentDayWithDate(String format){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat(format);
        return mdformat.format(calendar.getTime());
    }

    // End Point: Get System's Current Date & Returns it
    public static Date getCurrentDateInFormat(String format) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat(format);
        try {
            return mdformat.parse(mdformat.format(calendar.getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    // End Point: Get System's Current DateTime in specified format & Returns it
    public static Date getCurrentDateTimeInFormatOf(String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);

        try {
            Date currentDateTime = new Date();
            return formatter.parse(formatter.format(currentDateTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Will convert string date to Date object as per given format & return it
    public static Date formatDateToFormat(String date, String format){
        if(date == null || TextUtils.isEmpty(date))
            return null;

        SimpleDateFormat formatter = new SimpleDateFormat(format);

        try {
            return formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Returns Specific Time in 24 hour format
    public static String getSpecificTime(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 55);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(calendar.getTime());
    }

    public static Date convertDateToGivenFormat(String givenDateStr, String givenDateFormat, String toFormat){
        DateFormat dateFormat = new SimpleDateFormat(givenDateFormat);
        try {
            Date givenDate = dateFormat.parse(givenDateStr);
            if (givenDate != null) {
                DateFormat newDateFormat = new SimpleDateFormat(toFormat);
                String newDateStr = newDateFormat.format(givenDate);
                return newDateFormat.parse(newDateStr);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Will get Next 7 days from specific date
    public static List<String> getNext7DaysByDatesFrom(Date date, String format) {
        List<String> dayList = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            String dayWithDate = sdf.format(SystemUtils.getNextDateFrom(date, i));
            //Log.d("TAG", "getNext7DaysByDatesFrom_: "+dayWithDate);
            dayList.add(dayWithDate);
        }

        return dayList;
    }

    // End Point: Get System's Current Date & Returns it
    public static String getCurrentDate(String format){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat(format);
        return mdformat.format(calendar.getTime());
    }

    // Returns next date from specified date
    public static String getNextDateInStringFrom(Date date, String format, int dayGap){
        Date nextDate = getNextDateFrom(date, dayGap);
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateInString = sdf.format(nextDate);
        //Log.d("TAG", "getNextDateInStringFrom_Date: "+dateInString);
        return dateInString;
    }

    // Returns next date from specified date
    public static Date getNextDateFrom(Date date, int dayGap){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, dayGap);
        return calendar.getTime();
    }

    // Returns difference of time from current time
    public static long timeDifference(Date startTime, Date endTime){
        return endTime.getTime() - startTime.getTime();
    }

    // Returns difference of given times in minutes
    public static long timeDifferenceInMinutes(String startTimeStr, String endTimeStr){

        try{
            Date startTime = parseToDate(startTimeStr);
            Date endTime = parseToDate(endTimeStr);

            double differenceInMilliSec = endTime.getTime() - startTime.getTime();
            double differenceInSec = differenceInMilliSec / 1000;

            return (long) (differenceInSec / 60);

        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }

    public static double timeDifferenceInHours(Date startTime, Date endTime){
        double differenceInMilliSec = endTime.getTime() - startTime.getTime();
        double differenceInSec = differenceInMilliSec / 1000;
        double differenceInMin = differenceInSec / 60;

        return differenceInMin / 60;
    }

    // Parse given time to Date Object for Time
    public static Date parseToDate(String time){

        if(time == null || TextUtils.isEmpty(time))
            return null;

        String format = "HH:mm:ss"; // will show 24 hour format (0 to 23)
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Finds Current Day and returns it i.e. Monday, Tuesday... Sunday
    public static String findToday(){
        String today; // Default Day

        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day){
            case Calendar.SUNDAY:{
                today = "Sunday";
                break;
            }
            case Calendar.TUESDAY:{
                today = "Tuesday";
                break;
            }
            case Calendar.WEDNESDAY:{
                today = "Wednesday";
                break;
            }
            case Calendar.THURSDAY:{
                today = "Thursday";
                break;
            }
            case Calendar.FRIDAY:{
                today = "Friday";
                break;
            }
            case Calendar.SATURDAY:{
                today = "Saturday";
                break;
            }
            default:{
                today = "Monday";
                break;
            }
        }

        return today;
    }

    // Will return total week gap between given dates
    public static long findWeekDifference(String fromDate, String fromDateFormat, Date toDate, String toDateFormat) {
        Date startDate = convertDateToGivenFormat(fromDate, fromDateFormat, toDateFormat);

        //Log.d("TAG", "findWeekDifference_To_Date: "+toDate);

        if(startDate == null || toDate == null || toDate.before(startDate))
            return -1;

        long differenceInMilliSeconds = toDate.getTime() - startDate.getTime();

        long differenceInDays = TimeUnit.DAYS.convert(differenceInMilliSeconds, TimeUnit.MILLISECONDS);
        //Log.d("TAG", "findWeekDifference_Difference_Days: "+differenceInDays);

        long weeks = differenceInDays / 7;
        //Log.d("TAG", "findWeekDifference_Weeks: "+weeks);

        return weeks;
    }

    // Will return date of specified day otherwise return current date
    public static String findDateOfDay(String day, String format) {
        List<String> list = getNext7DaysByDatesFrom(SystemUtils.getCurrentDateInFormat(format), format);

        for(String dayWithDate : list){
            String dayOnly = dayWithDate.substring(0, dayWithDate.indexOf(','));
            String date = dayWithDate.substring(dayWithDate.indexOf(' '));

            if(dayOnly.equalsIgnoreCase(day))
                return date;
        }

        return getCurrentDate(format);
    }

    // Will filter date from given daywithdate i.e. filters Wednesday, 10/28/2020 & returns 10/28/2020 only
    public static String filterDateFromDayWithDate(String dayWithDate){
        return dayWithDate.substring(dayWithDate.indexOf(' ')+1);
    }

    // Will return dayWithDate of specified day otherwise return current date
    public static String findDayWithDateOf(String day, String format) {
        List<String> list = getNext7DaysByDatesFrom(SystemUtils.getCurrentDateInFormat(format), format);

        for(String dayWithDate : list){
            String dayOnly = dayWithDate.substring(0, dayWithDate.indexOf(','));

            if(dayOnly.equalsIgnoreCase(day))
                return dayWithDate;
        }

        return getCurrentDayWithDate(format);
    }

    // Will add leading zeros in given number
    @SuppressLint("DefaultLocale")
    public static String addLeadingZeroAtStart(long number){
        return String.format("%05d", number);
    }

    //Returns Formed Date after Adding specified DateTime in Calendar along with given minutes
    public static Date getCalendarDateTimeOf(Date dateTime, int minuteGap){
        try {
            if(dateTime != null){
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(dateTime);
                calendar.add(Calendar.MINUTE, minuteGap);

                return calendar.getTime();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

}