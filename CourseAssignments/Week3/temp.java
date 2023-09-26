public class temp {

}

    // **** Part 4 ****
    // The following method takes a guess from the user and matches it to a secret
    // number
    public static void isHighOrLow(int secretNumber) {
        // initialize a new scanner variable for the game
        Scanner guessInput = new Scanner(System.in);

        // The rules of the game
        System.out.println("Try to guess the number from 1 to 100, enter your guess: ");

        // recieve a guess from the user
        int userGuess = guessInput.nextInt();

        while (userGuess != secretNumber) {
            if ((userGuess != secretNumber) && ((userGuess < (secretNumber + 10)) && (userGuess > (secretNumber)))) {
                System.out.println("Your guess is too high, but within 10! Guess again: ");
                userGuess = guessInput.nextInt();
            } else if ((userGuess != secretNumber) && ((userGuess > (secretNumber - 10)))
                    && (userGuess < (secretNumber))) {
                System.out.println("Your guess is too low, but within 10! Guess again: ");
                userGuess = guessInput.nextInt();
            } else if ((userGuess != secretNumber) && (userGuess < secretNumber)) {
                System.out.println("Your guess is too low, guess again: ");
                userGuess = guessInput.nextInt();
            } else if ((userGuess != secretNumber) && (userGuess > secretNumber)) {
                System.out.println("Your guess is too high, guess again: ");
                userGuess = guessInput.nextInt();
            } else {
                break;
            }
        }
        System.out.println("How wonderful!! \n Your guess of " + userGuess + " was correct!!!");
    }
}