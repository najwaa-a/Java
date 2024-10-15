import java.util.Scanner;
//NAMA : NAJWA 
//NIM : 103122400028
public class TestScore {
       public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        int mjava, msql, mjsp;
        System.out.println("Masukan data nilai: ");
        mjava = masuk.nextInt();
        System.out.println("Masukan data nilai: ");
        msql = masuk.nextInt();
        System.out.println("Masukan data nilai: ");
        mjsp = masuk.nextInt();

       System.out.println("nilai java = " + mjava);
       System.out.println("nilai sql = " + msql);
       System.out.println("nilai jsp = " + mjsp);

    }
}