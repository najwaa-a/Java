
import java.util.Scanner;


public class GradeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int nilai = 92;

        if (nilai <= 100 && nilai > 89) {
            System.out.println("nilai A");

        } else if (nilai < 90 && nilai > 79) {
            System.out.println("nilai B");
        } else if (nilai < 80 && nilai > 69) {
            System.out.println("nilai C");
        } else if (nilai < 70 && nilai > 59) {
            System.out.println("nilai D");
        } else if (nilai < 60 && nilai >= 0) {
            System.out.println("nilai E");
        } else {
            System.out.println("Nilai tidak terdaftar");
        }

    }
}
