// PRINT THE FIBONACCI SERIES

import java.util.Scanner;

//0,1,1,2,3,5,8,13,21,34

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        // count of the above (prev + i)
        int count = 2;
        System.out.print(a +   ", ");
        System.out.print(b + ", ");
        while(count <= n ){
           // now i is going to be in temp variable because we need to add i , prev to get next fibonacci number
           int temp = b;
            b = b + a ; //next number (b is updated to whatever next number is added)
            a  = temp; // a is updated to b
            System.out.print(b + ", ");
            count ++;
        }
//        System.out.println(b);
    }
}
