
import java.util.Scanner;


public class TestMenu {
    public static void main(String[] args) {

        System.out.println("======================");
        System.out.println("1. Mendaftar");
        System.out.println("1. Lupa nama pengguna");
        System.out.println("3. Temukan kata sandi anda");
        System.out.println("4. End");
        System.out.println("======================");


        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("masukkan mau yang mana : ");
        x = input.nextInt();
        String xy;

        switch (x) {
            case 1:
            xy = "1";
            System.out.println("terdaftar");
            break;
            case 2:
            xy = "2";
            System.out.println("nama pengguna ditemukan");
            break;
            case 3:
            xy = "3";
            System.out.println("pengambilan kata sandi berhasil");
            break;
            case 4:
            xy = "4";
            System.out.println("ok");
            break;
        } input.close();
    }
    }
