package Level2;

import java.util.Arrays;

public class ReverseArrays {
    private static int count = 0;
    public static void main(String... args){
        int[] arraysNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArrays = new int[arraysNumbers.length];
        for (int i = arraysNumbers.length -1; i >= 0 ; i--) {
            newArrays[count] = arraysNumbers[i];
            count++;
        }
        System.out.println(Arrays.toString(newArrays));
    }
}
