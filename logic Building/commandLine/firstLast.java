package commandLine;
//Finding the first and Last digit of any Number.
import java.util.Scanner;

public class firstLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input: ");
        int n=sc.nextInt();
        int res1=firstDigit(n);
        System.out.println("First Digit: "+res1);
        int res2=lastDigit(n);
        System.out.println("Last Digit: "+res2);
    }

    public static int firstDigit(int num){
        while(num>=10){
            num=num/10;
        }
        return num;
    }

    public static int lastDigit(int n){
        n=n%10;
        return n;
    }
}
