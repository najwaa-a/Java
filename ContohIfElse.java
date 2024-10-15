import java.util.Scanner;

//NAMA : NAJWA NIM : 103122400028

public class ContohIfElse {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        int x = 8;

        if (x > 10) {
            System.out.println("x lebih besar dari 10");
        }
        if (x > 5) {
            System.out.println("x lebih besar dari 5");
        } else {
            System.out.println("x tidak lebih besar dari 5");
        }

        if (x > 10) {
            System.out.println("x lebih besar dari 10");
        }
        else if (x > 5) {
            System.out.println( "x lebih besar dari 5, tapi tidak lebih besar dari 10");
        }
        else if (x > 0) {
            System.out.println( "x lebih besar dari 0, tapi tidak lebih besar dari 5");
        }
        else {
            System.out.println("x kurang dari atau sama dengan 0");
        }

        
    }
}
