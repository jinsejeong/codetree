import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int i=A;
        while (i<=B) {
            System.out.print(i+" ");
            if(i%2==0)
                i+=3;
            else 
                i*=2;
        }
    }
}