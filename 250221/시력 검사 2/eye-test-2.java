import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vision = sc.nextDouble();
        if (vision >= 1.0) {
            System.out.print("High");
        }
        else if (vision >= 0.5) {
            System.out.print("Middle");
        }
        else 
            System.out.print("Low");
    }
}