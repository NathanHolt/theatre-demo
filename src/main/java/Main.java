import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat numFor = NumberFormat.getCurrencyInstance();
        //create age int
        int age;
        double price = 12.5;
        boolean hasToy = false;
        boolean hasSticker = false;

        System.out.println("Please input your age");
        age = scanner.nextInt();
        scanner.nextLine();

        // if check 1, age 10 and under
        if (age <= 10) {
            price = 5;

            // nested if, age 5 and under
            if (age < 5) {
                hasToy = true;
            }
        } else if (age > 65) {
            price = 8;

            if (age >= 70) {
                hasSticker = true;
            }
        }


        //output the amount owed (money = double)
        System.out.println("You owe this much: " + numFor.format(price));
        //print out if they got a toy
        if (hasToy) {
            System.out.println("And here is a free toy!");
        } else if (hasSticker) {
            System.out.println("And here is a free sticker!");
        }
    }
}
