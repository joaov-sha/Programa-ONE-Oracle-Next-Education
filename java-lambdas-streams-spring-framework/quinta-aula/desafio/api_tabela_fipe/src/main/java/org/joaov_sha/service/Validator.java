package org.joaov_sha.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Validator {
    
    public static boolean isValidFipeCode(String fipeCode){
        if(!fipeCode.matches("\\d{7}")) return false;
        return true;
    }

    public static String rearrangeFipeCode(String fipeCode){
        String rearrangedFipeCode = null;
        if(isValidFipeCode(fipeCode)){
            rearrangedFipeCode = fipeCode.substring(0,6);
            rearrangedFipeCode += '-';
            rearrangedFipeCode += fipeCode.substring(6);
            return rearrangedFipeCode;
        }
        return rearrangedFipeCode;
    }

    public static boolean isValidDate(String enteredDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.of("pt", "BR"));
        try {
            Date date = sdf.parse(enteredDate);
            Date initialDate = sdf.parse("01/01/1900");
            if(date.before(new Date()) && date.after(Date.from(initialDate.toInstant()))) return true;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String rearrangeDate(String enteredDate){
        String rearrangedDate = "";
        if(isValidDate(enteredDate)){
            rearrangedDate += enteredDate.toString().split("/")[2];
            rearrangedDate += "-";
            rearrangedDate += enteredDate.toString().split("/")[1];
        }
        return rearrangedDate;
    }
}
