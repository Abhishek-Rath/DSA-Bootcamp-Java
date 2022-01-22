import java.util.Scanner;


public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        int principal = input.nextInt();
        System.out.println("Enter rate of interest: ");
        float rateofInterest = input.nextFloat();
        System.out.println("Enter no. of years: ");
        int years = input.nextInt();

        float simpleInterest = (principal * rateofInterest * years)/100;
        System.out.println("The simple interest is: " + simpleInterest);
    }
}
