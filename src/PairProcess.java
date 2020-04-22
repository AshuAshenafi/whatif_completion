import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {
        //INPUT
        Scanner keyboard = new Scanner(System.in);

        int num1, num2;
        int sum_nums;
        int product_nums;
        double average;

        //prompt user to enter two numbers
        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        //PROCESS
        sum_nums = Integer.sum(num1, num2);
        product_nums = num1 * num2;
        average = Double.sum(num1,num2)/2;

        //OUTPUT
        System.out.printf("\nThe sum of (%,d and %,d) = %,d" ,num1, num2, sum_nums);
        if(sum_nums > 200){
            System.out.print("*");
        }
        if(sum_nums < 1000){
            System.out.print("~");
        }
        System.out.printf("\nThe product of (%,d and %,d) = %,d" , num1, num2, product_nums );
        System.out.printf("\nThe average of (%,d and %,d) = %,.1f" , num1, num2, average );

        //close scanner
        keyboard.close();
    }
}
