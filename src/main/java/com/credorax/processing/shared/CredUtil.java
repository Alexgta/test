package com.credorax.processing.shared;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CredUtil {

    public static void main(String[] args) {

        String str = "0123456";
        String str2 = str.substring(str.length() - 4);

        System.out.println(str2);


    }


    public static boolean expDateIsValid(String expDate) {

        boolean result = true;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMyy");
            long expDateLong = simpleDateFormat.parse(expDate).getTime();

            Date date = new Date();
            String currentDate = simpleDateFormat.format(date);
            long currentDateLong = simpleDateFormat.parse(currentDate).getTime();

            if (expDateLong < currentDateLong)
                result = false;

        } catch (Exception e) {
            result = false;
        }

        return result;
    }

}
