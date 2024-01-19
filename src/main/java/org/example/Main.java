package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //given
        //take any non-negative integer as an argument
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

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

        char[] reverse = new char[str2charArray.length];
        for(int i =0; i<reverse.length;i++){
            reverse[i] = str2charArray[reverse.length-1-i];
        }

        return Integer.parseInt(new String(reverse));
    }
}