package com.example.gstinsearch;
import java.util.regex.*;

public class GSTINValidator {

    public static boolean isValidGSTNo(String str) {

        String regex = "^([0]{1}[1-9]{1}|[1-2]{1}[0-9]{1}|[3]{1}[0-5]{1})([a-zA-Z]{5}[0-9]{4}[a-zA-Z]{1}[1-2]{1}[zZ]{1}[0-9a-zA-Z]{1})+$";

        Pattern p = Pattern.compile(regex);

        if (str == null) {
            return false;
        }

        Matcher m = p.matcher(str);

        return m.matches();

    }

}
