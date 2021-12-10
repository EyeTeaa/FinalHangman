import java.util.Random;
import java.util.Scanner;

public class Hangman
{
    Scanner scan = new Scanner(System.in);
    private String[] listOfAnimals = {"apple", "banana", "cat", "dog", "elephant"};
    private int randNum = (int) (Math.random() * (listOfAnimals.length-1));
    private String randWord = listOfAnimals[randNum];
    private String input = "";

    private String[] wordDivided = new String[randWord.length()];
    //constructors
    public Hangman()
    {
        
    }



    //takes the chosen random word and separates it by character
    //to be put in a string
    public void populateLettersOfWord(String word)
    {
        for (int v = 0 ; v < word.length() ; v++)
        {
            wordDivided[v] = word.substring(v,v+1);
            System.out.println(wordDivided[v]);
        }
    }

    public void generateSpaces()
    {

    }

    // a list of all the prompts and outputs
    public void listOfPrompts(int promptNum)
    {
        if (promptNum == 1 )
        {
            System.out.println("An animal has been selected");
        }
    }

    //validating the input from the user
    public void validateInput(String input)
    {
        if (input.equals(randWord))
        {
            System.out.println("same word");
        }
        else if (input.length() == 1)
        {
            for(int i = 0 ; i < wordDivided.length; i++)
            {
                if (wordDivided[i].equals(input))
                {
                    System.out.println("good");
                    break;
                }
                else
                {
                    System.out.println("not good");
                }
            }
        }
        else
        {
            System.out.println("You have guessed the word wrong ");
        }
    }

//getters
    public String getWordDivided() {
        String hold = "";
        for (String letter : wordDivided) {
            hold = hold + letter + ",";
        }
        return hold;
    }

    public String getRandWord() {
        return randWord;
    }

    //setters

}
