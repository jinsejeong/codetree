import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag = -1;
        for(int i=a; i<=b; i++) {
            if(1920%i==0 && 2880%i==0) {
                flag=0;
                break;
            }
        }
        if(flag==-1) 
            System.out.print("0");
        else 
            System.out.print("1");
        
    }
}