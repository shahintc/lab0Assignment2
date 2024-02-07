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

    public static int sumOfEvenIndex(int [] array)
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

    public static int sumOfOddIndex(int [] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++) 
        {
            if(i%2==1)
             {
                sum = sum + array[i];
             }
        }
        return sum;
    }

    public static int [] avgDiffArray(int [] array){
        int [] diffArray = array;
        int avg;
        int sum = 0;
        for (int i : array) {
            sum+= i;
        }
        avg=sum/ array.length;
        
        for (int i = 0; i < diffArray.length; i++) {
            diffArray[i] -= avg;
        }
        return diffArray;
        

    }
}