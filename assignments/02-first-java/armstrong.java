import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int temp = num;
        int sum = 0;
        while(temp > 0) {
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp = temp/10;
        }
        if(sum == num) {
            System.out.println(num + " is armstrong.");
        } else {
            System.out.println(num + " not armstrong.");
        }
    }
}
