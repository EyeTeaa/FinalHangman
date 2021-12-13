import java.util.Random;

public class ManAtStake
{
    //duplicate variables except one is static so that it can be referenced without the object in other classes
    private String name = "";
    private static String staticName = "";

    public ManAtStake(String name)
    {
        this.name = name;
        staticName = name;
    }

    public ManAtStake() {

    }


    //based on the chances the user has got, it will return console ort of the current state of the 'hangman'
    public String dyingStages(int numOfPenalties)
    {
        String output = "";
        if (numOfPenalties == 0)
        {
            output = "__________\n" +
                    "|         |\n" +
                    "|         \n" +
                    "|          \n" +
                    "|          \n" +
                    "|\n" +
                    "---";
        }else if (numOfPenalties == 1)
        {
            output = "__________\n" +
                    "|         |\n" +
                    "|         \uD83D\uDE1F\n" +
                    "|          \n" +
                    "|          \n" +
                    "|\n" +
                    "---";
        } else if (numOfPenalties == 2)
        {
            output = "__________\n" +
                    "|         |\n" +
                    "|         \uD83D\uDE1F\n" +
                    "|         Y \n" +
                    "|          \n" +
                    "|\n" +
                    "---";
        } else if (numOfPenalties == 3)
        {
            output = "__________\n" +
                    "|         |\n" +
                    "|         \uD83D\uDE1F\n" +
                    "|        /Y \n" +
                    "|          \n" +
                    "|\n" +
                    "---";
        } else if (numOfPenalties == 4)
        {
            output = "__________\n" +
                    "|         |\n" +
                    "|         \uD83D\uDE1F\n" +
                    "|        /Y\\ \n" +
                    "|          \n" +
                    "|\n" +
                    "---";
        } else if (numOfPenalties == 5 )
        {
            output = "__________\n" +
                    "|         |\n" +
                    "|         \uD83D\uDE1F\n" +
                    "|        /Y\\ \n" +
                    "|        /  \n" +
                    "|\n" +
                    "---";
        } else if (numOfPenalties == 6)
        {
            output = "__________\n" +
                    "|         |\n" +
                    "|         \uD83D\uDE1F\n" +
                    "|        /Y\\ \n" +
                    "|        / \\ \n" +
                    "|\n" +
                    "---";
        } else if (numOfPenalties == 7)
        {
            output = "__________\n" +
                    "|         |\n" +
                    "|         \uD83D\uDC80\n" +
                    "|        /Y\\ \n" +
                    "|        / \\ \n" +
                    "|\n" +
                    "---";
        }
        else
        {
            output = "__________\n" +
                    "|         |\n" +
                    "|         \n" +
                    "|          \n" +
                    "|          \n" +
                    "|\n" +
                    "---ob";
        }

        return output;
    }


    //setters
    public void setName(String name)
    {
        this.name = name;
        staticName = name;
    }
    //getters
    public String getName()
    {
        return name;
    }
    public static String getStaticName()
    {
        return staticName;
    }

}
