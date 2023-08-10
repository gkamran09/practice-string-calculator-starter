package com.tw;

public class StringCalculator {
    public int add(String string) {
        if(string.isEmpty()){
            return 0;
        }
        String comma = ",";
        if (string.startsWith("//")) {
            int newLineIndex = string.indexOf("\n");
            comma = string.substring(2, newLineIndex);
            string = string.substring(newLineIndex + 1);
        }

        String[] numbers = string.split("[\n" + comma + "]");
        int sum = 0;

        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}
