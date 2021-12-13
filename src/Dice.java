public class Dice
{
    private int diceRolled = 0;

    public Dice()
    {
        diceRolled = (int) (Math.random() * 6) + 1 ;
    }

    //checks if the user's guess is equal to the actual guess of the rolled dice.
    public boolean checkGuess(int guess)
    {
        if (guess == diceRolled)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //getters
    public int getDiceRolled() {
        return diceRolled;
    }

    //setters
}
