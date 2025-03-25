import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int hap=0;
       int cnt=0;

       while(true) {
            int a = sc.nextInt();
            if(a>=20 && a<=29) {
                hap+=a;
                cnt++;
            }
            else {
                break;
            }
       }
       System.out.printf("%.2f",(double)hap/cnt);
    }
}