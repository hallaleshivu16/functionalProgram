import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c");
        double c = sc.nextDouble();

        double delta = b*b-4*a*c;
        System.out.println("Delta is " +delta);
        if (delta > 0) {
            double root1 = (-b+Math.sqrt(delta))/(2*a);
            double root2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("Roots are:" );
            System.out.println("root1 of x: " +root1);
            System.out.println("root2 of x: " +root2);
        } else {
            System.out.println("Delta is less than 0");
        }
    }
}
