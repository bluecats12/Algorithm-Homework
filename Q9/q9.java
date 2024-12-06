package Q9;

import java.util.Scanner;

public class q9 {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int withdraw = scanner.nextInt();
        System.out.print("Enter amount of money: ");
        if (withdraw % 100 != 0) {
            System.out.println("Please enter amount of money more than 100 Baht");
        } else {
            int b1000 = withdraw / 1000;
            int remain = withdraw % 1000;

            int b500 = remain / 500;
            remain = remain % 500;

            int b100 = remain / 100;

            System.out.println(withdraw + " can be separated into");
            System.out.println(String.format("\n1000-Baht = %d", b1000) + " bills");
            System.out.println(String.format("\n500-Baht = %d", b500) + " bills");
            System.out.println(String.format("\n100-Baht = %d", b100) + " bills");
        }
    }
}
