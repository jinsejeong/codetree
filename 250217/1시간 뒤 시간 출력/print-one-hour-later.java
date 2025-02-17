import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String time = sc.next();

        String[] t = time.split(":");
        int a = Integer.parseInt(t[0]);
        int b = Integer.parseInt(t[1]);
        System.out.printf("%d:%d",a+1,b);
    }
}
