package Q5;

public class q5 {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int x = 5;
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4 - 1; i >= 0; i--) {

            for (int j = 0; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
