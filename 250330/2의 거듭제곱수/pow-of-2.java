import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int answer=0;
       while(true) {
            if(n==1)
                break;
            n/=2;
            answer++;
       }
       
       System.out.print(answer);
    }
}