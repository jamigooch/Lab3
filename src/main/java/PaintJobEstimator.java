
import java.util.Scanner;

public class PaintJobEstimator {

    public static void main(String[] args) {

//Set Total Square Feet
        double TotalSquareFeet = 0;

        Scanner keyboard = new Scanner(System.in);

//Get Paint Price per Gallon
        System.out.println("Please enter price per paint gallon");
        double PaintPrice = keyboard.nextInt();

//Get Number of Rooms to be painted
        System.out.println("Please enter the number of rooms to be painted.");
        double RoomsPainted = keyboard.nextInt();

//Get Square Feet per Room
        for (int i = 1; i <= RoomsPainted; i++) {
            System.out.println("Please enter square feet of of wall space in room " + i);
            double SquareFeet = keyboard.nextInt();

//Get Total Square Feet
            TotalSquareFeet = SquareFeet + TotalSquareFeet;
        }
//The Number of Gallons of Paint Required
        double NumberofGallons = NumberofGallonsMethod(TotalSquareFeet);
        //= (SquareFeet/ 115) * RoomsPainted;
        System.out.println("The number of gallons of paint required is " + NumberofGallons);

//The Hours of Labor Required
        double LaborHours = LaborHoursMethod(TotalSquareFeet);
        //=((SquareFeet / 115) * RoomsPainted) / 8;
        System.out.println("The number of hours required is " + LaborHours);

//The Cost of the Paint
        double PaintCost = PaintCostMethod(NumberofGallons, PaintPrice);
        //= NumberofGallons * PaintPrice;
        System.out.println("The cost of paint is " + PaintCost);

//The Cost of the Labor
        double LaborCost = LaborCostMethod(LaborHours);
        //= LaborHours * 18;
        System.out.println("The cost of labor is " + LaborCost);

//The Total Cost of the Paint Job
        double Total = TotalMethod(PaintCost, LaborCost);
        //= PaintCost + LaborCost;
        System.out.println("The total cost is " + Total);

    }

//METHODS
//Number of Gallons Method
    public static double NumberofGallonsMethod(double SquareFeet) {
        double Gallons = Math.ceil(SquareFeet / 115);
        return Gallons;
    }

//Labor Hours Method
    public static double LaborHoursMethod(double SquareFeet) {
        double Labor1 = Math.ceil((SquareFeet / 155) * 8);
        return Labor1;
    }

//Paint Cost Method
    public static double PaintCostMethod(double PaintPrice, double NumberofGallons) {
        double Paint = Math.ceil(PaintPrice * NumberofGallons);
        return Paint;
    }

//Labor Cost Method
    public static double LaborCostMethod(double LaborHours) {
        double Labor2 = Math.ceil(LaborHours * 18);
        return Labor2;
    }

//Total Cost Method
    public static double TotalMethod(double PaintCost, double LaborCost) {
        double Total = Math.ceil(PaintCost * LaborCost);
        return Total;

    }
}
