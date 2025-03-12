import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int i = 1;
        while (i<=N) {
            int a = sc.nextInt();
            if(a%2==1 && a%3==0)
                System.out.println(a);
            i++;
        }
    }
}