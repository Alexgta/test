package com.credorax.processing.shared;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CredUtil {

    /**
     *   expDate should be in format: MMyy
     *   MM: 01 - 12
     *   yy: 01 - 99
     *
     * */

    public static boolean expDateIsValid(String expDate) {

        boolean result = true;
        // Check that expDate in format:  MMyy:
        String regex = "(0[1-9]|1[012])[0-9]{2}";
        if (expDate == null || !expDate.matches(regex)) {
            result = false;
        } else {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMyy");
                long expDateLong = simpleDateFormat.parse(expDate).getTime();

                Date date = new Date();
                String currentDate = simpleDateFormat.format(date);
                long currentDateLong = simpleDateFormat.parse(currentDate).getTime();

                // if date in past: return false
                if (expDateLong < currentDateLong)
                    result = false;

            } catch (Exception e) {
                result = false;
            }
        }
        return result;
    }

   /**
    *  mail regex: "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    *
    *
    *       (?=.{1,64}@)            local-part min 1 max 64
    *       [A-Za-z0-9_-]+          Start with chars in the bracket [ ], one or more (+)
    *                               dot (.) not in the bracket[], it can't start with a dot (.)
    *
    *       (\\.[A-Za-z0-9_-]+)*	follow by a dot (.), then chars in the bracket [ ] one or more (+)
    *                               * means this is optional
    *                               this rule for two dots (.)
    *
    *       @                       must contains a @ symbol
    *
    *       [^-]                    domain can't start with a hyphen (-)
    *       [A-Za-z0-9-]+           Start with chars in the bracket [ ], one or more (+)
    *       (\\.[A-Za-z0-9-]+)*     follow by a dot (.), optional
    *       (\\.[A-Za-z]{2,})       the last tld, chars in the bracket [ ], min 2
    **/
    public static boolean emailIsInValidFormat(String email) {

        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return email != null && email.matches(regex);

    }



   /**
    * Checks if the pan is valid
    *
    * @param pan
    *           {@link String} pan number
    * @return result {@link boolean} true of false
    */
    public static boolean panIsValid(String pan) {
        String regex = "[0-9]{16}";
        if (pan == null || !pan.matches(regex))
            return false;

        char checkDigit = pan.charAt(pan.length() - 1);
        String digit = calculateCheckDigit(pan.substring(0, pan.length() - 1));
        return checkDigit == digit.charAt(0);
    }


    /**
     * Calculates the last digits for the pan number received as parameter
     *
     * @param pan
     *           {@link String} number
     * @return {@link String} the check digit
     */
    private static String calculateCheckDigit(String pan) {
        if (pan == null)
            return null;
        String digit;
        /* convert to array of int for simplicity */
        int[] digits = new int[pan.length()];
        for (int i = 0; i < pan.length(); i++) {
            digits[i] = Character.getNumericValue(pan.charAt(i));
        }

        /* double every other starting from right - jumping from 2 in 2 */
        for (int i = digits.length - 1; i >= 0; i -= 2)	{
            digits[i] += digits[i];

            /* taking the sum of digits grater than 10 - simple trick by substract 9 */
            if (digits[i] >= 10) {
                digits[i] = digits[i] - 9;
            }
        }
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        /* multiply by 9 step */
        sum = sum * 9;

        /* convert to string to be easier to take the last digit */
        digit = sum + "";
        return digit.substring(digit.length() - 1);
    }







}
