import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String basic = sc.next().trim(); 
        String numX = sc.next().trim();
        String numY = sc.next().trim();
        System.out.printf("010-%s-%s",numY,numX);
    }
}