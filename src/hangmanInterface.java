import java.util.Scanner;

public interface hangmanInterface
{

     String[] correctLetters = new String[26];
     int indexOfCL = 0;
     String[] incorrectLetters = new String[6];
     int indexofIL = 0;

     boolean wordIsGuessed = false;
     int numOfBadWordGuesses = 0;
     int badInput = 0;

    public void populateLettersOfWord(String word);
    public String generateProgress();
    public void validateInput(String input);
}
