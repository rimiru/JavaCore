package Java.Core.Chapter2;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        System.out.println("Input fibonacci lenght: ");
        Scanner sc = new Scanner(System.in);
        int fib = sc.nextInt();
        sc.close();

        int[] arr = new int[fib];

        if(fib<3){
            for (int i=0;i<fib;i++){
                arr[i] = i++;
            }
        }
        else {
            arr[0]=0;
            arr[1]=1;
            for (int i =2; i<fib; i++){
                arr[i] = (arr[i-1]+arr[i-2]);
            }
        }

        // OUPUT
        System.out.println("Output: ");
        for(int i=0;i<fib; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }
}
