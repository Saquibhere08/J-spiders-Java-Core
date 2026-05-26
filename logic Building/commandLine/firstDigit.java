package commandLine;

import java.util.Scanner;

//Find the First Digit of a Number.
public class firstDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input: ");
        int num=sc.nextInt();
        int res=firstDigitNumber(num);
        System.out.println(res);

    }
    public static int firstDigitNumber(int num){
        while(num>=10){
            num=num/10;

        }
        return num;
    }
}
