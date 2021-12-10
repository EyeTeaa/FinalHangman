public class Main
{
    public static void main (String[] args)
    {

        Hangman yea = new Hangman();
        yea.populateLettersOfWord(yea.getRandWord());
        System.out.println(yea.getWordDivided());

         }

    }

