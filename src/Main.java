import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.format("Let's play a game!\nYou have to guess" +
                " the number from %d to %d, and you have %d shots", Constants.Imin, Constants.Imax, Constants.Shot);
        System.out.println("\nDo you want to play? Type Y to play, N to exit");
        //reading the answer
        Scanner answ = new Scanner(System.in);
        String answ1 = answ.next();
        //checking the answer
        if (answ1.equalsIgnoreCase("N")) {
            System.out.println("Good bye");
            return;
        }
        while (answ1.equalsIgnoreCase("Y")) {
            Random rn = new Random();
            int MyN = rn.nextInt(Constants.Imax - Constants.Imin + 1) + Constants.Imin;

            for (int i = 1; i <= Constants.Shot; i++) {
                System.out.println("Give me your number, plz");
                //reading the number
                int n1 = answ.nextInt();
                //comparing
                boolean comp = (n1 == MyN);
                System.out.println(comp);
                if (!comp & i < Constants.Shot) {
                    System.out.println("Try once more");
                } else if (!comp && i == Constants.Shot) {
                    System.out.println("Oops. No more shots");
                    break;
                } else {
                    System.out.println("You won! Grats");
                    break;
                }

            }


            System.out.println("Do you want to play one more time? Type Y to play, N to exit");
            answ1 = answ.next();
        }

    }
}
