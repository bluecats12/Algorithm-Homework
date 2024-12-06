package Q3;
import java.util.Scanner;
public class q3 {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your salary : ");
        double x = scanner.nextDouble();
        scanner.close();
        if(x <= 15000) {
            x = x * 0.05;
        } else {
            x = 15000 * 0.05;
        }
        System.out.print("Your Welfare is "+ x + " Baht");
    }
}
