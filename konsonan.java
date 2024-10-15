
import java.util.Scanner;

public class konsonan {

    public static void main(Char[] args) {
        Scanner Input = new Scanner(System.in);

        Char huruf;

        System.out.println("Input huruf :");
        huruf = Input.next();
        Char A = null;

        String I = null;

        String U = null;

        String E = null;

        String O = null;

        if (!huruf.equals(U) && !huruf.equals(I)&& !huruf.equals (A) && !huruf.equals(E) && !huruf.equals(O)) {
            System.out.println("konsonan");
        } else {
            System.out.println("huruf :" + huruf + "Bukan konsonan");
        }
    }
}
