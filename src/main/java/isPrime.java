
import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //Get number input
        System.out.println("Plese enter a number.");
        int Number = keyboard.nextInt();

        //Method
        int Argument = isPrime(Number);

        //Argument If Not Prime
        if (Argument >= 1) {
            System.out.println("This number is NOT a prime number.");

            //Argument If Prime
        } else if (Argument == 0) {
            System.out.println("This number is a prime number.");
        }

    }

//Method
    public static int isPrime(int Number) {
        int Argument = 0;

        //Prime
        if (Number == 2 || Number == 1 || Number == 0) {
            Argument = 0;

            //Not Prime
        } else if (Number > 2) {
            for (int i = 2; i < Number; i++) {

                if (Number % i == 0) {
                    Argument = 1 + Argument;

                } else if (Number % i == 1) {
                    Argument = 0 + Argument;
                }
            }
        }
        // Return
        return Argument;
    }
}
