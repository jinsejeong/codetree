import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int ab = Integer.parseInt(A+B);
        int ba = Integer.parseInt(B+A);
        System.out.print(ab+ba);

    }
}