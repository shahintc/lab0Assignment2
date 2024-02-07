import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class assignment2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array: ");
        boolean keepReading = true;

        while(keepReading)
        {
            if(in.hasNextInt())
            {
                keepReading = false;
            }
            else 
            {
                System.out.print("Please enter an integer: ");
                in.next();
            }
        }
        size = in.nextInt();
        int [] array = createArray(size);
        System.out.println(Arrays.toString(array));
        
       
        boolean keepReading2 = true;

        int choice;
        while(keepReading2)
        {
            System.out.print("1-Sum Of Even Index\n" +"2-Sum Of Odd Index\n" + "3-Average Difference Array\n" + "4-Find a minimum\n" + "5-Find a maximum\n"+"6-Exit\n"+ "Select a choice: ");
            if(in.hasNextInt())
            {
                choice = in.nextInt();
                if(choice>=1 &&  choice<=5)
                {
                   if(choice==1)
                   {
                        System.out.println("Sum of even indexes is : " + sumOfEvenIndex(array));
                   }
                   else if(choice == 2)
                   {
                    System.out.println("Sum of odd indexes is : " + sumOfOddIndex(array));
                   }
                   else if(choice == 3)
                   {
                        System.out.println("Avarage difference array " + Arrays.toString(avgDiffArray(array)));
                   }
                   else if(choice==4)
                   {
                    System.out.println("Minumum of array is " + findMinimum(array));
                   }
                   else
                   {
                    System.out.println("Maximum of array is " + findMaximum(array));
                   }
                }
                else if(choice==6)
                {
                    System.out.println("Exiting! ");
                    keepReading2 = false;
                }
                else
                {
                    System.out.print("Selection should be a number between 1 and 6\n");
                }
            }
            else 
            {
                System.out.print("Selection should be an integer!\n");
                in.next();
            }

        }
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

    public static int findMaximum (int [] array)
    {
        int max = -1;
        for(int number: array)
        {
            if (max < number) 
            {
                max = number;
            }
        }

        return max;
    }


    public static int findMinimum (int [] array)
    {
        int min = 101;
        for(int number: array)
        {
            if (min > number) 
            {
                min = number;    
            }
        }

        return min;
    }
}