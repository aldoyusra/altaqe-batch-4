import java.util.Scanner;

public class KoversiNilai {
    public static void main(String[] args) {

        Scanner nilai = new Scanner(System.in);
        System.out.print("masukkan nilai siswa ");
        int inputNilai = nilai.nextInt();

        if (inputNilai >= 80&&inputNilai <=100) {
            System.out.print("Nilai Anda A");
        }
        else if (inputNilai >=65&&inputNilai <=79) {
            System.out.print("Nilai Anda B+");
        }
        else if (inputNilai >=50&&inputNilai <=64) {
            System.out.print("Nilai Anda B");
        }
        else if (inputNilai >=35&&inputNilai <=49) {
            System.out.print("Nilai Anda C");
        }
        else if (inputNilai >=0&&inputNilai <=34) {
            System.out.print("Nilai Anda D");
        }
        else  {
            System.out.print("Nilai Anda Invalid!!!");
        }
    }
}
