package Java.Core.Chapter2;

import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1=sc.nextInt();

        System.out.println("Input the second number: ");
        int num2 = sc.nextInt();
        sc.close();

        System.out.print("Result: " + multiply(num1,num2));
    }

    public static int multiply(int n1, int n2){
        int result = 0;
        boolean zeroResult = n1 == 0 || n2 == 0;
        boolean positiveResult = (n1 > 0 && n2 > 0) || (n1 < 0 && n2 < 0);
        boolean negativeResult = (n1 > 0 && n2 < 0) || (n1 <0 && n2 >0);

        // Tinh gia tri tuyet doi cua n1 va n2
        int n1Abs = Math.abs(n1);
        int n2Abs = Math.abs(n2);

        for (int i = 1; i <= n1Abs; i++)
        {
            result += n2Abs;
        }

        /**
         * Kiem tra cac truong hop
         * Neu co 1 trong 2 so n1 va n2 = 0 thi product = 0
         * Neu 2 so cung dau thi product = tich cua 2 so gia tri tuyet doi n01 va n02
         * Neu 2 so trai dau thi product = so doi cua tich cua 2 so gia tri tuyet doi n01 va n02
         */


        if (zeroResult){
            result = 0;
        } else if (positiveResult){
            result = result;
        } else if (negativeResult){
            result = -result;
        }
        return result;
    }
}
