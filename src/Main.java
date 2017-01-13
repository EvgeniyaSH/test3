import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.format("Let's play a game!\nYou have to guess" +
                " the number from %d to %d, and you have %d shots", Constants.Imin, Constants.Imax, Constants.Shot);
        System.out.println("\nDo you want to play? Type Y to play, N to exit");
        //reading the answer
        Scanner answ = new Scanner(System.in);
        String answ1 = answ.next();
        System.out.println(answ1);
        //checking the answer
        if (answ1.equalsIgnoreCase("N")) {
            System.out.println("Good bye");
            return;
        }
        while (answ1.equalsIgnoreCase("Y")) {
            System.out.println("test");
            System.out.println("Do you want to play one more time? Type Y to play, N to exit");
            answ1 = answ.next();
        }
        //just to check
        System.out.println("check");
    }
}
