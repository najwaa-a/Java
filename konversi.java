import java.util.Scanner;

public class konversi {
    public static void main(String args[]) {
        Scanner masuk = new Scanner (System.in);
        float m, cm, inci;
        System.out.println("Masukan ukuran dalam Meter:");
        m = masuk.nextFloat();
        cm = m * 100;
        inci = m * 100 / 2.54f;
        System.out.println("Ukuran dalam CM = " + cm);
        System.out.println("Ukuran dalam Inci = " + inci);
    }
}