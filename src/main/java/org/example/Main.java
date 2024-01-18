package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //given
        //take any non-negative integer as an argument
        int num = 42145;

        //when
        //return it with its digits in descending order.
        //Essentially, rearrange the digits to create the highest possible number.
        int result = sortDesc(num);
        System.out.println("Result after arranging digits in descending order: " + result);
        
    }
    private static int sortDesc(final int num) {
        String int2str = String.valueOf(num);

        char[] str2charArray = int2str.toCharArray();
        Arrays.sort(str2charArray);
        for (char i : str2charArray) {
            System.out.println(i);
        }


        return 0;
    }
}