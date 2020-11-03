import java.util.Random;
import java.util.Scanner;

public class Zahlenratespiel {
    public Zahlenratespiel() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int counter = 1;
        int zufallszahl = rd.nextInt(101);
        int again = 1;

        while(again == 1) {
            do {
                System.out.print("Guess [" + counter + "]: ");
                int guess = sc.nextInt();
                ++counter;
                if (counter <= 6 && guess < zufallszahl) {
                    System.out.println("No, number is too low.");
                } else if (counter <= 6 && guess > zufallszahl) {
                    System.out.println("No, number is too high.");
                } else {
                    if (zufallszahl == guess) {
                        System.out.println("you won 👍");
                        break;
                    }else
                        System.out.println("you lost");
                }
            } while(counter <= 6);

            System.out.println("the number was : " + zufallszahl);
            System.out.println("wanna try again nibba (❁´◡`❁) ?\t[1] for yes [2] for no");
            again = sc.nextInt();
            if (again == 1) {
                counter = 1;
                zufallszahl = rd.nextInt(101);
            }
        }
    }
}

