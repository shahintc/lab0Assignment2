import java.util.Arrays;
import java.util.Random;
public class assignment2 
{
    public static void main(String[] args) 
    {
        int [] array = createArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println(sumOfOddIndex(array));
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

    public static int sumOfOddIndex(int [] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++) 
        {
            if(i%2!=1)
             {
                sum = sum + array[i];
             }
        }
        return sum;
    }

}