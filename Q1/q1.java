package Q1;

import java.util.Scanner;

public class q1 {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input P : ");
        int P = scanner.nextInt();
        System.out.print("Input Q : ");
        int Q = scanner.nextInt();
        scanner.close();
        int PQ = P ^ Q;
        if (PQ > 1 || PQ < 0) {
            System.out.println("Please input 1 or 0 only");
        } else {
            System.out.println(P + " XOR " + Q + " = " + PQ);
        }
    }
}
