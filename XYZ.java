import java.util.Scanner;

public class XYZ {

    public static void main(String[] args) {
        Scanner tinggi = new Scanner(System.in);
        System.out.print("height : ");
        int height = tinggi.nextInt();

        for (int i = 1; i <= height;  i++) {
            for (int j = 1; j <= height; j++) {

                if (i % 3 == 0 || j % 3 == 0) {
                    System.out.print("X");
                    System.out.print(" ");
                } else if (i % 2 == 1 || j % 1 == 0) {
                    System.out.print("Y");
                    System.out.print(" ");
                } else {
                    System.out.print("Z");
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
}
