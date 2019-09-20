package arranging;
	
import java.util.Scanner;

public class Arrange
{


	    public static void main(String[] args) 
	    {
	       
			int num;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        num=s.nextInt();
	        float a[] = new float[num],temp;
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < num; i++) 
	        {
	            a[i] = s.nextFloat();
	        }
	        for (int i = 0; i < num; i++) 
	        {
	            for (int j = i + 1; j < num; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.println("Ascending Order: ");
	        for (int i = 0; i < num; i++) 
	        {
	            System.out.println(a[i]);
	        }
	        ///System.out.print(a[n-1]);
	    }
	
	}


