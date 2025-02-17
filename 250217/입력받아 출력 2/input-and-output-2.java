import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String date = sc.next().trim();
        String number = sc.next().trim();
        System.out.printf("%s%s",date,number);
    }
}