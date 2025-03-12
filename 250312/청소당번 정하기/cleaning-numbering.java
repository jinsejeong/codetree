import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int clean2=0;
        int clean3=0;
        int clean12=0;
        for(int i=1; i<=n; i++) {
            if(i%12==0)
                clean12++;
            else if(i%3==0)
                clean3++;
            else if(i%2==0)
                clean2++;
        }
        System.out.printf("%d %d %d",clean2,clean3,clean12);
    }
}