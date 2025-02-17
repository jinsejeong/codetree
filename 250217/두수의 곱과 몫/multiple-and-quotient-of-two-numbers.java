import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b>=1 && b<=a && a<=500) {
            System.out.printf("%d * %d = %d\n%d / %d = %d",a,b,a*b,a,b,a/b);
        }
    }
}