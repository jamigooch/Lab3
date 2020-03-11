
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Input Even or Odd number
        System.out.println("Please enter a number");
        int Number = keyboard.nextInt();

        //isPrime
        int Argument = EvenOdd(Number);

        //Argument
        if (Argument == 1) {
            System.out.println("This is an even number.");
        } else if (Argument == 0) {
            System.out.println("This is an odd number");
        }
    }

//Method
    public static int EvenOdd(int Number) {
        int Argument = 0;
        //Even
        if ((Number % 2) == 0) {
            Argument = 1;

            //Odd
        } else {
            Argument = 0;
        }

        //Return
        return Argument;
    }
}
