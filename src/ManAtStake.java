import java.util.Random;

public class ManAtStake
{
    private String name = "";
    private String[] dyingPhrases = {"a", "b", "c", "d", "e", "f"};

    public ManAtStake(String name)
    {
        this.name = name;
    }

    //generates a random phrase from the list of phrases
    public String generatePhrase(int num)
    {
        // generate random numbers within 1 to 10
        int rand = (int)(Math.random() * dyingPhrases.length);
        return dyingPhrases[rand];
    }


    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    //getters
    public String getName()
    {
        return name;
    }

}
