import java.util.Scanner;

/**
 * Created by jc225828 on 25/08/17.
 */
public class EvenOdd {
    public static void main(String[] args) {
        int num;
        String output;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer");
        num = input.nextInt();
        if (num % 2 == 0)
            output = "Number is even";
        else
            output = "Number is odd";
        System.out.println(output);
    }
}
