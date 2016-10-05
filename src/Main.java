import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        String correctWord = "bicycle";
        String[] characters = new String[correctWord.length()];
        char[] ch = correctWord.toCharArray();
        String[] correctLetters = new String[correctWord.length()];
        ArrayList<String> guessedLetters = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int lives = 10;

        for (int i = 0; i < correctWord.length(); i++) {
            characters[i] = String.valueOf(ch[i]);
        }

        gameBoard();
        lives(lives);
        System.out.println();
        letterMenu(correctWord.length());

        do {
            if (lives == 0) {
                System.out.printf("The correct word was %s", correctWord);
                break;
            }
            System.out.printf("%nGuess a letter and press enter%nlives left %d%n", lives);
            String guess = scanner.nextLine();
            if (guess.length() > 1) {
                System.out.println("You can only guess one letter at a time please");
                continue;
            }
            if (guessedLetters.contains(guess)) {
                System.out.println("You already guessed that letter.");
                lives(lives);
                continue;
            }
            if (correctWord.toLowerCase().contains(guess.toLowerCase())) {
                guessedLetters.add(guess);
                lives(lives);
                for (int i = 0; i < correctWord.length(); i++) {
                    if (characters[i].equalsIgnoreCase(guess)) {
                        correctLetters[i] = characters[i];
                    }
                }
                for (String e : correctLetters) {
                    if (e != null) {
                        System.out.printf("%s ", e);
                    } else {
                        System.out.print("_ ");
                    }
                }

            } else {
                System.out.println("Incorrect!");
                guessedLetters.add(guess);
                lives--;
                lives(lives);
                for (String e : correctLetters) {
                    if (e != null) {
                        System.out.printf("%s ", e);
                    } else {
                        System.out.print("_ ");
                    }
                }
            }
            System.out.println();
            if (Arrays.equals(correctLetters, characters)) {
                System.out.println("You win!");
            }
        } while (!(Arrays.equals(correctLetters, characters)));

    }

    public static void gameBoard() {
        System.out.println("Welcome to Hangman!\n");
    }

    public static void lives(int i) {
        switch (i) {
            case 10:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 9:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   (        |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 8:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   ()       |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 7:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   ()       |");
                System.out.println("   |        |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 6:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   ()       |");
                System.out.println("   ||       |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 5:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   ()       |");
                System.out.println("  \\||      |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 4:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   ()       |");
                System.out.println("  \\||/     |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 3:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   ()       |");
                System.out.println("  \\||/     |");
                System.out.println("   |        |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 2:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   ()       |");
                System.out.println("  \\||/     |");
                System.out.println("   ||       |");
                System.out.println("            |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 1:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   ()       |");
                System.out.println("  \\||/     |");
                System.out.println("   ||       |");
                System.out.println("   /        |");
                System.out.println("            |");
                System.out.println("___________________");
                break;
            case 0:
                System.out.println("_____________");
                System.out.println("   |        |");
                System.out.println("   ()       |");
                System.out.println("  \\||/     |");
                System.out.println("   ||       |");
                System.out.println("   /\\      |");
                System.out.println("            |");
                System.out.println("___________________");
                System.out.println("Sorry,you lose!");
                break;

        }
    }

    public static void letterMenu(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("_ ");
        }
    }

}
