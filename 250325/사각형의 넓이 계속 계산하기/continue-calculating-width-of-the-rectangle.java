import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        
            int weight = sc.nextInt();
            int height = sc.nextInt();
            String str = sc.next();
        if(str.equals("C")){
                 System.out.println(weight*height);
                break;}

            System.out.println(weight*height);
            }
        }
    }

