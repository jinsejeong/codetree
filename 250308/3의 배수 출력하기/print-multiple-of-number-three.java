import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextIntI();
        int i = 1;
        while (i<=N) {
            System.out.print(i+" ");
            i+=2;
        }
    }
}