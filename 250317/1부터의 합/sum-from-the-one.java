import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hap=0;
        for(int i=1; i<=100; i++) {
            hap+=i;
            if(hap>=n) {
                System.out.print(i);
                break;
            }
            
        }
        
    }
}