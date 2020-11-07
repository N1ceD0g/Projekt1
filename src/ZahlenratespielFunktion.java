import java.util.Random;
import java.util.Scanner;

public class ZahlenratespielFunktion {
    public ZahlenratespielFunktion() {
    }

    private static void game() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int counter = 1;
        int zufallszahl = rd.nextInt(101);

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
                    System.out.println("you won");
                    break;
                }

                System.out.println("you lost");
            }
        } while(counter <= 6);

        System.out.println("the number was : " + zufallszahl);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean var2 = true;

        int again;
        do {
            System.out.flush();
            game();
            System.out.println("wanna try again?\t[1] for yes [2] for no");
            again = sc.nextInt();
        } while(again == 1);

    }
}
