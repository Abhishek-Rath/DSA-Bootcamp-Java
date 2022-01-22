import java.util.Scanner;

public class currencyConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter currency in rupees: ");
        int rupees = input.nextInt();
        double dollars = 0.013 * rupees;
        System.out.println(rupees + " rupees = " + dollars + " USD" );

    }
}
