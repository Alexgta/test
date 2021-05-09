package com.credorax.processing.shared;

import org.apache.tomcat.util.codec.binary.Base64;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CredUtil {

    public static void main(String[] args) {

        byte[] encodedBytes = Base64.encodeBase64("Test".getBytes());
        System.out.println("encodedBytes: " + new String(encodedBytes));
        byte[] decodedBytes = Base64.decodeBase64(encodedBytes);
        System.out.println("decodedBytes " + new String(decodedBytes));

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
