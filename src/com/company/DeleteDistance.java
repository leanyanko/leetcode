package com.company;

import java.util.HashMap;
import java.util.Map;

public class DeleteDistance {
    public static int dist (String str1, String str2) {
        int result = 0;

        int i = 0;
        while (str2.indexOf(str1.charAt(i)) < 0) {
            result += Character.getNumericValue(str1.charAt(i));
            i++;
        }
        int j = str2.indexOf(str1.charAt(i));

        while (str1.charAt(i) == str2.charAt(j)) {
            i++;
            j++;
        }



        return result;
    }
    public static void main(String[] args) {
        String str1 = "boat";
        String str2 = "got";

        System.out.println(dist(str1, str2));
    }
}
