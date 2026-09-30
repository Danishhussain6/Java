 import java.util.Scanner;

class OperatorsDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            // Factorial
            int fact = 1;
            for (int i = 1; i <= n; i++)
                fact *= i;

            System.out.println("Factorial = " + fact);

            // Even/Odd
            if (n % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");

            // Fibonacci
            System.out.print("Fibonacci: ");
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }

            // Prime
            boolean prime = true;
            if (n < 2)
                prime = false;

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.println("\nPrime");
            else
                System.out.println("\nNot Prime");
        }
    }
} 
    

