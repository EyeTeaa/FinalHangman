import java.util.Random;
import java.util.Scanner;

public class Hangman implements hangmanInterface
{
    Scanner scan = new Scanner(System.in);

    private String[] listOfAnimals = {"aardvark", "penguin", "bullfrog", "tortoise", "elephant", "albacore",
    "alligator", "gecko", "eagle", "axolotl", "bison", "dolphin", "cheetah", "squirrel"}; //list of words
    private int randNum = (int) (Math.random() * (listOfAnimals.length-1)); //generates random number from 0 - the length of the random words
    private String randWord = listOfAnimals[randNum]; //random word from list
    private String[] wordDivided = new String[randWord.length()]; // array of letters of word

    private String[] correctLetters = new String[26];
    private int indexOfCL = 0;
    private String[] incorrectLetters = new String[6];
    private int indexofIL = 0;

    private boolean wordIsGuessed = false;
    private int numOfBadWordGuesses = 0;
    private int badInput = 0;


    //constructors
    public Hangman()
    {

    }



    //takes the chosen random word and separates it by character
    //each character is added to an array
    public void populateLettersOfWord(String word)
    {
        for (int v = 0 ; v < word.length() ; v++)
        {
            wordDivided[v] = word.substring(v,v+1);
            //System.out.println(wordDivided[v]);
        }
    }


    //generates the underscores and the letters that have been guessed so far
    //also generates a list of incorrectly guessed letters.
    public String generateProgress()
    {
        String[] arrHold = new String[randWord.length()];

        for (int v = 0 ; v < arrHold.length ; v++ )//first populates the temporary array with underscores
        {
            arrHold[v] = "_";
        }

        //nested for loops iterate and compare each one of the values in one array to each value in another array,
        if (correctLetters[0] != null) { //checks if correct letters have been guessed
            for (int j = 0; j < correctLetters.length; j++)
            {//for each value in correct letters.
                for (int y = 0; y < wordDivided.length; y++)
                {//for each letter in the word
                    if (wordDivided[y].equals(correctLetters[j]))
                    {
                        arrHold[y] = wordDivided[y];
                    }
                }
            }

            int numLettersGuessed = 0; //variable to hold the number of letters guessed
            for (int m = 0 ; m < arrHold.length; m++) //calculated within this for loop that compares the temporary array and the actual array
            {
                if (arrHold[m].equals(wordDivided[m]))
                {
                    numLettersGuessed = numLettersGuessed + 1;
                }
            }
            if (numLettersGuessed == wordDivided.length)//correct if both arrays are equal
            {
                wordIsGuessed = true;
                return "Good Job for winning buddy! You get 10$... and your friend '" + ManAtStake.getStaticName() + "' is free to go, bye.";
            }

        }

        String temp = "";
        for (int u = 0 ; u < arrHold.length; u++)
        {
            temp = temp + arrHold[u] + " ";
        }

        String temp2 = "";
        for (int n = 0 ; n < incorrectLetters.length; n++)
        {
            if (incorrectLetters[n] != null)
            {
                temp2 = temp2 + incorrectLetters[n] + ", ";
            }
        }

        return "Progress...{" + temp + "}\nIncorrect Letters {" + temp2 + "}";
    }//end generateProgress


    //this validates the input from the user
    public void validateInput(String input)
    {
        input = input.trim();
        if (input.equals(randWord)) // checks if word is guessed
        {
            wordIsGuessed = true;
            System.out.println("Good Job for winning buddy! You get 10$... and your friend '" + ManAtStake.getStaticName() + "'is free to go, bye");
        }
        else if (input.length() == 1)//checks if the length of the input to see if it's a single character.
        {
            boolean isValidLetter = false;
            boolean alreadyGuessed = false;
            if (indexOfCL != 0)
            {
                for (int c = 0; c < indexOfCL; c++) {//loops through the correct letters list to see if the letter has been guessed
                    if (correctLetters[c].equals(input) && alreadyGuessed == false)
                    {
                        System.out.println("You've already guessed the letter " + input);
                        alreadyGuessed = true;
                    }
                }
            }

            if (indexofIL != 0)
            {
                for (int c = 0; c < indexofIL; c++) { //loops through the incorrect letters list to see if the letter has been guessed
                    if (incorrectLetters[c].equals(input) && alreadyGuessed == false)
                    {
                        System.out.println("You've already guessed the letter " + input);
                        alreadyGuessed = true;
                    }
                }
            }


            for(int i = 0 ; i < wordDivided.length; i++) { //checks to see if the input is equal to any of the actual letters in the word
                if (wordDivided[i].equals(input) && isValidLetter == false && alreadyGuessed == false)
                {
                    correctLetters[indexOfCL] = input;
                    indexOfCL = indexOfCL + 1;
                    isValidLetter = true;
                    //System.out.println("good guess");

                }
            }
            if (isValidLetter == false && alreadyGuessed == false)//if letter is incorrectly guessed
            {
                incorrectLetters[indexofIL] = input;
                indexofIL = indexofIL + 1;
                badInput = badInput + 1;
                //System.out.println("bad guess");
            }

        }
        else
        {//anything else means that a word has been an attempted guess and it was wrong.
            numOfBadWordGuesses = numOfBadWordGuesses + 1;
            System.out.println("You have guessed the word wrong");
        }
    }//end validateInput


//getters
    public String getWordDivided() {
        String hold = "";
        for (String letter : wordDivided) {
            hold = hold + letter + ",";
        }
        return hold;
    }

    public String getCorrectLetters()
    {
        String hold = "";
        for (String letter : correctLetters)
        {
            hold = hold + letter + ",";
        }
        return hold;
    }

    public String getRandWord() {
        return randWord;
    }

    public int getBadInput()
    {
        return badInput;
    }

    public boolean getWordIsGuessed()
    {
        return wordIsGuessed;
    }

    public int getIndexofIL()
    {
        return indexofIL;
    }

    public int getNumOfBadWordGuesses() {
        return numOfBadWordGuesses;
    }

    //setters

}
