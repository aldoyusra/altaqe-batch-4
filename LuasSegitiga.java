import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner alas = new Scanner(System.in);
        System.out.print("masukkan alas: ");
        int inputAlas = alas.nextInt();

        Scanner tinggi = new Scanner(System.in);
        System.out.print("masukkan tinggi: ");
        int inputTinggi = tinggi.nextInt();

        double luas = 0.5 * inputAlas * inputTinggi;
        System.out.print(" jadi luas segitiganya " + luas);
    }
}
