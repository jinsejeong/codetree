import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int flag=0;
        for(int i=a; i<=b; i++) {
            if(i%c==0){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}