package com.example.common;

import java.util.ArrayList;

/**
 * Created by stephenwicks on 7/25/17.
 */
public enum Month {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String EnglishName;

    Month(String englishName) {
        this.EnglishName = englishName;
    }

    public String getGetEnglishName() {
        return EnglishName;
    }


    public static ArrayList<String> getRemainingMonths(String month){
        ArrayList<String> renturnedArrayList = new ArrayList<>();
        month = month.toUpperCase();
        boolean monthCheck = false;
        for (Month months : Month.values()){
            if (months.name().equals(month)){
                monthCheck = true;
            }
            if (monthCheck){
                renturnedArrayList.add(months.getGetEnglishName());
            }
        }
        return renturnedArrayList;
    }
}
