import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class FunctionTest {
    @Test
    void arraytest() {
        System.out.println("orginal");
        int[] number = {7,5,9,10,6};
        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println("sorted");
        Arrays.sort(number);
        for (int m : number) {
            System.out.print(m+ " ");
        }
        }
        //System.out.println(number);


    @Test
    void arrayTest2() {

        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr,2,5);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    @Test
    void arrayTest3() {
        //descending
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] number ={ 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("orginal");
        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println("sorted");
        Arrays.sort(number, Collections.reverseOrder());
        for (int m : number) {
            System.out.print(m+ " ");
        }
    }

    @Test
    void arrayTest4() {
        String[] name = {"moh", "reza", "hassan", "amir"};
        System.out.println("orginal");
        for (String s : name) {
            System.out.print(s+" ");
        }
        Arrays.sort(name, Collections.reverseOrder());
        System.out.println("sort");
        for (String d : name) {
            System.out.print(d+" ");
        }
    }

    @Test
    void convertTest() {
        int number = 12345;
        String int2str = String.valueOf(number);
        char[] digits = int2str.toCharArray();
        for (char i : digits) {
            System.out.print(i);
        }
    }

    @Test
    void convertTest2() {
        String s= "hello";
        char[] c = s.toCharArray();
        //System.out.println(c);
        //c.length = count of c array index
        Character[] newArray = new Character[c.length];
        for (int i = 0; i < c.length; i++) {
            System.out.println(i);
            newArray[i] = c[i];
        }
        for (Character m : newArray) {
            System.out.println(m);
        }

    }

    @Test
    void convert3() {
        int n = 12345;
        //i 0 1/ 12/ 23/ 34 / 45
        String M = String.valueOf(n);
        char[] d = M.toCharArray();

        for (char i : d) {
            Arrays.sort(d);
        }
        char[] reverse = new char[d.length];

        for(int m=0; m<reverse.length;m++){
            reverse[m] = d[reverse.length-1-m]; //5-1-0
            System.out.println(m);

        }
        for (char c : reverse) {
            System.out.println(c);
        }
    }

    @Test
    void forTest() {
        int[] n = {3,5,4,6,9,7,1,8,2};
       // Arrays.sort(n);

        int[] reverse = new int[n.length];
        for (int i = 0; i<reverse.length;i++){
            reverse[i] = n[reverse.length-1-i];
        }
        for (int m : reverse) {
            System.out.print(m);
        }
    }
}
