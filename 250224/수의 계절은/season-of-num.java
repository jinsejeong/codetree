import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int season = sc.nextInt();
        if(season>=1 && season<=12){
            if(season >=3 && season<=5)
                System.out.print("Spring");
            else if(season >=6 && season<=8)
                System.out.print("Summer");
            else if(season >=9 && season<=11)
                System.out.print("Fall");
            else 
                System.out.print("Winter");
        }
    }
}