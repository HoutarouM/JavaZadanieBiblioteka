package com.zadanieBiblioteka;

import java.util.regex.Pattern;

public class DateValidator {
    public static boolean validate(String date) {
        Pattern datePattern = Pattern.compile("\\d{2}.\\d{2}.\\d{4}");

        return datePattern.matcher(date).matches();
    }
}
