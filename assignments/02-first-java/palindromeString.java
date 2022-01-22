import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        String ans = "";
        int n = str.length();
        // for(int i = n - 1; i >=0; i--) {
        //     ans += str.charAt(i);
        // }

        // if(str.equals(ans)) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not palindrome");
        // }

        int first = 0;
        int last = n - 1;
        boolean palindrome = false;
        
        while(first < last) {
            if(str.charAt(first) != str.charAt(last)) {
                palindrome = false;
            } else {
                palindrome = true;
            }
            first++;
            last--;
        }

        if(palindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
