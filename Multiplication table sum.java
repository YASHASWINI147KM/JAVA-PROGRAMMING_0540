import java.util.Scanner;

public class MultiplicationTableSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
            sum += product; 
        }

        System.out.println("Sum of multiplication table = " + sum);

        sc.close();
    }
}
