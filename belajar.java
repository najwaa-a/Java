
import java.util.Scanner;

public class belajar {

    public static void main(String[] args) {
        Scanner nilai = new Scanner(System.in);

        System.out.println("Masukkan nilai: ");
        int x = nilai.nextInt();

        switch (x) {
            case 1:
                System.out.println("SATU");
                break;
            case 2:
                System.out.println("DUA");
                break;
            case 3:
                System.out.println("TIGA EMPAT");
                break;

            default:
                System.out.println("HAHAHAHA");
                break;
        }

    }

}
