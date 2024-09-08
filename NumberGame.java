//Task no 1
//NumberGame
               import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean playing = true;
        System.out.println("Welcome to NumberGame!");
        System.out.println("You will enjoy a lot" + "by winning the match");
        System.out.println("You will play a number between 1 and 100 ");
        System.out.println("All the best dear participants");
        System.out.println("Hope you enjoy it ");
        System.out.println("Ready to have fun ");


        String playAgain;
        while (playing) {
            int trail = 9;
            int finals = 0;
            int random = (int) (Math.random() * 100) + 1;
            boolean guessedNumber = false;
            System.out.println("Dear participants you all have to guess the number starting from 1 and end at 100");

            for (int i = 0; i < trail; i++) {
                System.out.println("trail" + (i + 1) + " : Enter your guessed number : ");
                int user = sc.nextInt();

                if (user == random) {
                    guessedNumber = true;
                    finals++;

                    System.out.println("You literally did it");
                    System.out.println("Awesome you won the match");
                    break;

                } else if (user > random) {

                    System.out.println("Your number is too high");
                    System.out.println("Try again");
                } else {
                    System.out.println("Your number is too low");
                    System.out.println("Please insert a litte bit bigger number");

                }
            }
            if (!guessedNumber) {
                System.out.println("Oops! You lose");
                System.out.println("You lost all your trail");
            }
            System.out.println("Do you want to try again");
            System.out.println("if try again so you will literally enjoy it!");

            System.out.println("Do you want to play again (yes/no)");
             playAgain = sc.next();
            if (playAgain.equalsIgnoreCase("no")) {
                playing = false;
            }
            System.out.println("Thank you for playing!");
            System.out.println("Your final score: " + finals);
            System.out.println("Hope you enjoyed ");

        }

        }
    }
