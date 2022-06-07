import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[]args) {

        Scanner number = new Scanner(System.in);
        System.out.print("input number prime : ");
        int inputNumber = number.nextInt();

        boolean flag = false;
        for (int i = 1; i <= inputNumber / 2 ; i++) {
            if(inputNumber % i == 0) {
                flag = true;
                break;
            }
        }

        if  (!flag)
            System.out.println("the number is prime number");
        else
            System.out.println("the number is not prime");
        } }