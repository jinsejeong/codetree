import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A>0) {
            for(int i=1; i<=B; i++) {
                System.out.print(A);
            }
        }
        else if(A<=0)
            System.out.print("0");
    }
}