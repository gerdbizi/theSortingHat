import java.util.Scanner;
public class Hat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter your name");
        String name = input.nextLine();
        System.out.println ("Enter your favourite letter between a-d");
        String letter = input.nextLine();
        System.out.println ("Do you like pizza? (true/false)");
        boolean pizza = input.nextBoolean();
        input.nextLine();
        System.out.println ("Do you like sports? (true/false)");
        boolean sports = input.nextBoolean();
        input.nextLine();
        System.out.println ("Enter your kindness rating /10.");
        int kindness = input.nextInt();
        System.out.println ("Enter your average from last year using decimals.");
        double average = input.nextDouble();


        int Gryffindor = 0;
        int Ravenclaw = 0;
        int Slytherin = 0;
        int Hufflepuff = 0;
        int max = Gryffindor;
        sortingHat(name, pizza, sports, kindness, letter, average, Gryffindor, Ravenclaw, 
        Slytherin, Hufflepuff);

        System.out.println (name + " you belong to " + max);

    }
    
    public static int sortingHat(String name, boolean pizza, boolean sports, int kindness, 
    String letter, double average, int Gryffindor, int Ravenclaw, int Slytherin, int Hufflepuff)
    {

        if(letter == "a" || letter == "A")
        {
            Gryffindor = Gryffindor + 1;
        }
        else if(letter == "b" || letter == "B")
        {
            Ravenclaw = Ravenclaw + 1;
        }
        else if(letter == "c" || letter == "C")
        {
            Slytherin = Slytherin + 1;
        }
        else if (letter == "d" || letter == "D")
        {
            Hufflepuff = Hufflepuff + 1;
        }

        if (pizza)
        {
            Gryffindor = Gryffindor + 1;
            Ravenclaw = Ravenclaw + 1;
            Slytherin = Slytherin;
            Hufflepuff = Hufflepuff;
        }

        if (sports)
        {
            Gryffindor = Gryffindor + 1;
            Ravenclaw = Ravenclaw - 1;
            Slytherin = Slytherin + 3;
            Hufflepuff = Hufflepuff;
        }

        if (kindness >0 && kindness <= 3)
        {
            Slytherin = Slytherin -4;
        }
        else if (kindness >= 4 && kindness <= 6)
        {
            Hufflepuff = Hufflepuff + 2;
        }
        else if (kindness >= 7 && kindness <= 8)
        {
            Ravenclaw = Ravenclaw + 3;
        }
        else if (kindness >= 9 && kindness <= 10)
        {
            Gryffindor = Gryffindor + 5;
        }
        if (average >= 50 && average <= 65)
        {
            Hufflepuff = Hufflepuff -1;
        }
        else if (average >= 66 && average <= 75)
        {
            Slytherin = Slytherin +1;
        }
        else if (average >= 76 && average <= 85)
        {
            Ravenclaw = Ravenclaw + 3;
        }
        else if (average >= 86 && average <= 100)
        {
            Gryffindor = Gryffindor + 5;
        }

        int max = Gryffindor;
        if (Ravenclaw > max)
        {
            max = Ravenclaw;
        }
        if (Slytherin > max)
        {
            max = Slytherin;
        }
        if (Hufflepuff > max)
        {
            max = Hufflepuff;
        }
        return max;
    }
}


