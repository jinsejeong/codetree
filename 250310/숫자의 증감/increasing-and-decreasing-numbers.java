import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int N = sc.nextInt();
        if(c.equals("A")) {
            for(int i=0; i<N; i++) {
                System.out.print(i+1+" ");
            }
        }
        if(c.equals("D")) {
            for(int i=N; i>=1; i--) {
                System.out.print(i+" ");
            }
        }

    }
}