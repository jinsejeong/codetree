import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String s = (score == 100) ? "pass" : "failure" ;
        System.out.print(s);
    }
}