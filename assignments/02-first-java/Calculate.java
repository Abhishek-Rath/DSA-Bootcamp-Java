import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int result = 0;

        char operator = input.next().charAt(0);

        if(operator == '+') {
            result = num1 + num2;
        } else if(operator == '-') {
            if(num1 > num2)
                result = num1 - num2;
            else 
                result = num2 - num1;
        } else if(operator == '*') {
            result = num1 * num2;
        } else {
            if(num2 != 0)
                result = num1/num2;
            else
                System.out.println("Cannot divide number by zero :(");
        }
        System.out.println("The result of operation " + operator + " on two numbers " + num1 + " " + num2 + " is: " + result);
    }
}
