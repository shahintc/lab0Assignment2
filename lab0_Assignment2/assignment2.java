import java.util.Arrays;
import java.util.Random;
public class assignment2 
{
    public static void main(String[] args) 
    {
        
    }
    public static int [] createArray(int size)
    {
        int [] array = new int[size];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) 
        {
            array[i] = rand.nextInt(101);
        }
        return array;
    }
}