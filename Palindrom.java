import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        Scanner original = new Scanner(System.in);
        System.out.print("kata yang mau di palindrom : ");
        String Original, reverse = "";
        Original = original.nextLine();

        int length = Original.length();

        for (int i = length - 1; i >= 0; --i)
            reverse = reverse + Original.charAt(i);

        if (Original.equals(reverse))
                System.out.println("The string is palindrom");
        else
                System.out.println("The string is not palindrom");


        }
    }

