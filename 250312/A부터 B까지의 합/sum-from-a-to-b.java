import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int hap=0;

       for(int i=a; i<=b; i++) {
            hap+=i;
       }
       System.out.print(hap);
    }
}