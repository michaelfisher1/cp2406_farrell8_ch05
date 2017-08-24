import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
/**
 * Created by jc225828 on 25/08/17.
 */
public class AscendingAndDescending {
    public static void main(String[] args) {
        int num;
        Integer[]myNums = new Integer[3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num = input.nextInt();
        myNums[0] = num;
        System.out.println("Enter the second number:");
        num = input.nextInt();
        myNums[1] = num;
        System.out.println("Enter the third number:");
        num = input.nextInt();
        myNums[2] = num;
        display("Original Array: ", myNums);
        Arrays.sort(myNums);
        display("Sorted Ascending: ", myNums);
        Arrays.sort(myNums, Collections.reverseOrder());
        display("Sorted Descending: ", myNums);
    }

    public static void display(String message, Integer array[])
    {
        int size = array.length;
        System.out.println(message);
        for(int x = 0; x <size; ++x)
            System.out.print(array[x] + " ");
        System.out.println();
    }
}
