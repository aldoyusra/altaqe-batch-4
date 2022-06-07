import java.util.Scanner;

import static javafx.scene.input.KeyCode.Y;

public class DrawXYZ {

    // X = URUTAN KELIPATAN 3
    // Y = KELIPATAN GANJIL
    // Z = KELIPATAN GENAP

    private static void gambarXYZ(int height) {
        for (int i = 1; i <= height * height; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
            } else if (i % 2 == 1) {
                System.out.print("Y ");
            } else {
                System.out.print("Z ");
            }
            if (i % height == 0)
            System.out.println(" ");
            }
        }


    public static void main(String[] args) {

        Scanner b = new Scanner(System.in);
        System.out.print("masukkan height ");
        int height = b.nextInt();

        gambarXYZ(height);



        }
    }
