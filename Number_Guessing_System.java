package number_guessing_system;

import java.util.Scanner;

public class Number_Guessing_System {

    private static int rounds;
    public static void main(String[] args) {
         // Generate a random number from 1 to 100
         int randomNumber = (int)(Math.random() * 100) + 1;

         // Create a Scanner object to read user input
         Scanner sc = new Scanner(System.in);
 
         // Initialize the number of attempts
         int attempts = 1;
 
         // Initialize the number of rounds
         int rounds = 5;
 
         // Start the game loop
         while (rounds > 0) {
             // Prompt the user to enter their guess
             System.out.println("Enter your guess: ");
             int guess = sc.nextInt();
 
             // Check if the guess is correct
             if (guess == randomNumber) {
                 // The user guessed correctly, so break out of the loop
                 System.out.println("Congratulations, you guessed the number correctly!");
                 rounds--;
                 break;
             } 
            // else if (attempts == 5) {
             //    System.out.println("Your trial is over: "
              //   + "Please start again");

             //}

             else {
                 // The guess is incorrect, so increment the number of attempts
                 attempts++;
                // Tell the user if their guess is higher or lower than the random number
                 if (guess < randomNumber) {
                     System.out.println("Your guess is lower than the random number.");
                 }
                 else {
                     System.out.println("Your guess is higher than the random number.");
                 }
             }
         }
         System.out.println("Your rounds is " + rounds);
         System.out.println("Your attempts is " + attempts);
         

         
         // Calculate the score
        int score = rounds * attempts;

        // Display the score
        System.out.println("You guessed the number in " + attempts + " attempts.");
        System.out.println("Your score is " + score + ".");
       
    }
}


    
