// code for when the whole word is guessed
// add interface
// add cosmetics for 'man at stake'


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ManAtStake friend = new ManAtStake();
        Hangman hm = new Hangman();
        Dice dice1 = new Dice();
        int response = 0;

        //beginning prompts and initialization of the friend's name
        System.out.println("\n(pregame)You and a friend decide to play a round of hangman for the chance of 10$ at the carnival...\n\nWhat is your friend's name?"
        + "\n- enter a name:");
        friend.setName(scan.nextLine());
        System.out.println("\n\nYou and and your friend decide that you would be the one guessing the word\nYour friend '" + friend.getName() + "' is the person at stake\n\n");
        System.out.println("---Welcome to Hangman!---\nYour word is in the category of animals");
        System.out.println(hm.generateProgress());

        //System.out.println(hm.getRandWord());
        hm.populateLettersOfWord(hm.getRandWord());//uses the method to create an array of a word divided by letters

        //this loop will keep repeating until either the user has ran out of chances or the word is guessed
        while (hm.getWordIsGuessed() == false && hm.getIndexofIL() + hm.getNumOfBadWordGuesses() < 6)
        {
            hm.validateInput(scan.nextLine());
            if (hm.getWordIsGuessed() == true)
            {
                break;
            }
            System.out.println( "\n\n****************************************************\n\n" + friend.dyingStages(hm.getIndexofIL()+hm.getNumOfBadWordGuesses()));
            System.out.println(hm.generateProgress());
        }


        if(hm.getWordIsGuessed() == true)
        {
            System.out.println("-");
        }

        //if statement with nested if statements for all the directions the player can go with the game.
        if (hm.getIndexofIL() + hm.getNumOfBadWordGuesses() >= 6)
        {
            System.out.println("\n\n\nYou have failed to guess the word");
            System.out.println("Your friend '" + friend.getName() + "' will die.\n\nHowever, if you predict the number of a rolled dice, your friend would get a second chance at life!" +
                    "\nBut if you fail to guess correctly, there will be a secret cost..." +
                    "\n\nWould you like to roll?\n- enter '1' for yes and '2' for no");


            response = scan.nextInt();
            if (response == 1)
            {
                System.out.println("You chose to roll a dice!\nWhat number do you predict the dice will land on?\n- enter an integer between 1 and 6");
                if (dice1.checkGuess(scan.nextInt()) == true)//dice is used to determine if the user gets a second chance
                {
                    System.out.println("Congrats! The dice rolled " + dice1.getDiceRolled());
                    System.out.println("\nYou saved your friend '" + friend.getName() + "' from death!\nThanks for playing, bye.");
                }
                else
                {
                    System.out.println("How tragic, you failed twice" +
                            "\nThe dice rolled on " + dice1.getDiceRolled() + " and the word was '" + hm.getRandWord() + "'" +
                            "\n\n(you and your friend '" + friend.getName() + "' die)");
                    System.out.println(friend.dyingStages(hm.getIndexofIL()+hm.getNumOfBadWordGuesses()+1 ));
                }
            }
            else if (response == 2)
            {
                System.out.println("You give up too easy" + "\nThe word was " + hm.getRandWord() +
                        "\n(your friend '" + friend.getName() + "' dies");
                System.out.println(friend.dyingStages(hm.getIndexofIL()+hm.getNumOfBadWordGuesses()+1 ));
            }
        }

    }//end main method

}//end main class



