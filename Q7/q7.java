package Q7;
import java.util.Scanner;
public class q7 {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Fibonanci number: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("Calculating");
        int a = 0, b = 1;
        if (num >= 0) {
            System.out.println("f0 = " + a);
        }
        if (num >= 1) {
            System.out.println("f1 = " + b);
        }
        for (int i = 2; i <= num; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println("f" + i + " = " + b);
        }
        System.out.println("Value of Fibonacci is " + b);
    }
}
