import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String eng = sc.next();
        switch(eng) {
            case "S" :
                System.out.print("Superior");
                break;
            case "A" :
                System.out.print("Excellent");
                break;
            case "B" :
                System.out.print("Good");
                break;
            case "C" :
                System.out.print("Usually");
                break;
            case "D" :
                System.out.print("Effort");
                break;
            default:
                System.out.print("Failure");
                break;
        }
    }
}