import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat numFor = NumberFormat.getCurrencyInstance();
        //create age int
        int age;
        double price;
        String extra = "";

        System.out.println("Please input your age");
        age = scanner.nextInt();
        scanner.nextLine();

        // if check 1, age 10 and under
        if (age <= 10) {
            price = 5;

            // nested if, age 5 and under
            if (age < 5) {
                extra = "toy";
            }
        } else if (age > 65) {
            price = 8;

            if (age >= 70) {
                extra = "sticker";
            }
            if (age >= 80) {
                extra = "advil";
            }
        } else {
            price = 12.5;
        }


            //output the amount owed (money = double)
        System.out.println("You owe this much: " + numFor.format(price));
        //print out if they got a toy


        switch (extra) {
            case "toy":
                System.out.println("You got a toy!");
                break;
            case "sticker":
                System.out.println("You got a sticker!");
                break;
            case "advil":
                System.out.println("You got a advil!");
                break;
            default:
                System.out.println("No extra.");
                break;
        }
    }
}
