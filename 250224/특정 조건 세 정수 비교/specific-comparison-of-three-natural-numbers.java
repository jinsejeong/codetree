import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int min = A;
        if(min > B)
            min=B;
        if(min > C) 
            min=C;
        
        if(A==min)
            System.out.print("1 ");
        else 
            System.out.print("0 ");

        
        if ((A==B) && (A==C))
            System.out.println("1");
        else 
            System.out.println("0");
    }
}