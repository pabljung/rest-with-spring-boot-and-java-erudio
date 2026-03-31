package com.github.pablo.util;

import com.github.pablo.exception.UnsupportedMathOperationException;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) {
        if (!isNumeric(strNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return Double.parseDouble(strNumber.replace(",", "."));
    }

    public static boolean isNumeric(String strNumber){
        if (strNumber == null || strNumber.isEmpty()) return false;
        return strNumber.replace(",", ".").matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}