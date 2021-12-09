public class Dice
{
    private int diceRolled = 0;

    public Dice()
    {
        int diceRolled = (int) (Math.random() * 9) ;
    }

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
    public void setDiceRolled(int diceRolled) {
        this.diceRolled = (int) (Math.random() * 6) + 1;
    }
}
