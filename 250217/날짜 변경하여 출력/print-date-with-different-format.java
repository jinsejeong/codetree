import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        String[] date = s.split("\\.");
        int a = Integer.parseInt(date[0]);
        int b = Integer.parseInt(date[1]);
        int c = Integer.parseInt(date[2]);
        System.out.printf("%d-%d-%d",b,c,a);
    }
}