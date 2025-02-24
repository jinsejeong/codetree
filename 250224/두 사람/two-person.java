import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int aAge = sc.nextInt();
        String aGender = sc.next();
        int bAge = sc.nextInt();
        String bGender = sc.next();

        if(aAge < 19 && bAge <19) {
                System.out.print("0");
        }
        else {
            if (aGender=="W" && bGender=="w")
                System.out.print("0");
            else 
                System.out.print("1");
        }
    }
}