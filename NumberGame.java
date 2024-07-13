import java.util.Random;
import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    Random random=new Random();
    int lowerBound=1;
    int upperBound=100;
    boolean playAgain=true;
    while(playAgain){
        int numberToGuess=random.nextInt(upperBound-lowerBound+1)+lowerBound;
        int attempts=0;
        boolean hasGuessedCorrectly=false;
        int maxAttempts=10;
        System.out.println("Guess the number between " +lowerBound+" and " +upperBound+":");
    while(!hasGuessedCorrectly && attempts<maxAttempts){
        attempts++;
        System.out.println("Enter Your guess:");
        int userGuess=scanner.nextInt();
        if(userGuess<numberToGuess){
            System.out.println("Too low!");
        }else if(userGuess>numberToGuess){
            System.out.println("Too high!");
        }else{
            System.out.println("Correct!You've guessed the number.");
            hasGuessedCorrectly=true;
        }
    }
  if(!hasGuessedCorrectly){
        System.out.println("You've used all attempts.The number was:"+numberToGuess);
    }
    System.out.println("Your Score:"+(hasGuessedCorrectly?maxAttempts-attempts:0));
    System.out.println("Do You want to play again?(Yes/No):");
    playAgain=scanner.next().equalsIgnoreCase("Yes");
}
scanner.close();
System.out.println("Thank You For Playing!");
}
}


