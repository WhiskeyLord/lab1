import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MathThing opera = new MathThing();
        opera.count_sum();
        System.out.println("Input number to count factorial= ");
        int num = in.nextInt();
        opera.count_factorial(3);
    }
}
