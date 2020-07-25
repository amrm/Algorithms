package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class DateTransform {
    static DateFormat outputFormat = new SimpleDateFormat("YYYYMMDD", Locale.ENGLISH);

    static DateFormat dataFormat_1 = new SimpleDateFormat("yyyy/mm/dd",  Locale.ENGLISH);
    static DateFormat dataFormat_2 = new SimpleDateFormat("DD/MM/YYYY", Locale.ENGLISH);
    static DateFormat dataFormat_3 = new SimpleDateFormat("DD-MM-YYYY", Locale.ENGLISH);

    private static Pattern DATE_PATTERN_1 = Pattern.compile("^\\d{4}/\\d{2}/\\d{2}$");
    private static Pattern DATE_PATTERN_2 = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
    private static Pattern DATE_PATTERN_3 = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");



    public static List<String> changeDateFormat(List<String> dates) {
        List<String> list=new ArrayList<>();
        Date date;
        DateFormat dateFormat;
        for(String dateStr:dates){
            try{
                dateFormat = getDateFormat(dateStr);
                if(dateFormat!=null) {
                    date = dateFormat.parse(dateStr);
                    System.out.println(date);
                    dateStr = outputFormat.format(date);
                }
                list.add(dateStr);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return list;
    }


    public static DateFormat getDateFormat(String dateStr){
        if(DATE_PATTERN_1.matcher(dateStr).matches()){
            return dataFormat_1;
        }
        else if(DATE_PATTERN_2.matcher(dateStr).matches()){
            return dataFormat_2;
        }
        else if(DATE_PATTERN_3.matcher(dateStr).matches()){
            return dataFormat_3;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {


        List<String> dates = changeDateFormat(Arrays.asList("2010/03/30", "15/12/2016", "11-15-2012", "20130720"));
        for(String date : dates) {
            System.out.println(date);
        }
    }
}
