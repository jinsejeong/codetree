import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int middleScore = sc.nextInt();
        int lastScore = sc.nextInt();

        if(middleScore >= 90) {
            if (lastScore >=95) 
                System.out.println("100000");
            else if(lastScore >=90) 
                System.out.println("50000");
            else 
                System.out.println("0");
        }
        else
            System.out.println("0");
    }
}