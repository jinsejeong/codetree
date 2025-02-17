import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();
        String[] d = date.split("-");
        int month = Integer.parseInt(d[0]);
        int day = Integer.parseInt(d[1]);
        int year = Integer.parseInt(d[2]);
        System.out.printf("%d.%d.%d",year,month,day);
    }
}