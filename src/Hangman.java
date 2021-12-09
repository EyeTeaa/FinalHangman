import java.util.Random;

public class Hangman
{
    private String[] listOfWords = {"apple", "banana", "cat", "dog", "elephant"};
    private int randNum = (int) (Math.random() * (listOfWords.length-1));
    private String randWord = listOfWords[randNum];

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
