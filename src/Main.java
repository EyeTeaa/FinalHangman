public class Main
{
    public static void main (String[] args)
    {

        Hangman yea = new Hangman();
        yea.populateLettersOfWord(yea.getRandWord());
        System.out.println(yea.getWordDivided());
//        // generate random numbers within 1 to 10
//        for (int i = 0; i < 10; i++) {
//            int rand = (int) (Math.random() * 6) ;
//            System.out.println(rand);
//        }

//        String[] listOfWords = {"apple", "banana", "cat", "dog", "elephant"};
//         int randNum = (int) (Math.random() * listOfWords.length);
//         for (int v  = 0 ; v < 10 ; v++){
//             randNum = (int) (Math.random() * listOfWords.length);
//             String randWord = listOfWords[randNum];
//             System.out.println(randWord);
//             System.out.println(randWord.length());
         }

    }

