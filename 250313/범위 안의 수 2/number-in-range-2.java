import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hap=0;
        int cnt=0;
        for(int i=1; i<=10; i++) {
            int a=sc.nextInt();
            if(a>=0 && a<=200) {
                hap+=a;
                cnt++;
            }
        }
        System.out.printf("%d %.1f",hap,(double)hap/cnt);
    }
}