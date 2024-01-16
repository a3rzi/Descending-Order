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
        System.out.println(c);
        //c.length = count of c array index
        Character[] newArray = new Character[c.length];
        for (int i = 0; i < c.length; i++) {
            System.out.println(i);
            newArray[i] = c[i];
        }

    }
}
