import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user till user does not press X or x
        int ans = 0;
//        while (true){
            // take the operator as input
            System.out.print("Enter the operator" + " ");
            char op = sc.next().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input of two numbers
                System.out.println("Enter the numbers");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op=='+'){
                    ans = num1 + num2;
                }
                if(op=='-'){
                    ans = num1 - num2;
                }
                if(op=='*'){
                    ans = num1 * num2;
                }
                if(op=='/'){
                    ans = num1/num2; // returns quotient
                }
                if(op=='%'){
                    ans = num1 % num2; // returns remainder
                }

            }else if (op=='x' || op == 'X'){
                System.out.print("wrong operand");

            }else{
                System.out.println("invalid input");
            }
            System.out.println(ans);
//        }

    }
}
