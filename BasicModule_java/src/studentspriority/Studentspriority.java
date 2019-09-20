package studentspriority;
	
import java.util.Scanner;

public class  Studentspriority {


	    public static void main(String[] args) 
	    {
	       
			int num;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number of students:");
	        num=s.nextInt();
	      int a[] = new int[num],temp;
	        System.out.println("Enter the marks of students:");
	        for (int i = 0; i < num; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        for (int i = 0; i < num; i++) 
	        {
	            for (int j = i + 1; j < num; j++) 
	            {
	                if (a[i] < a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.println("the priority of marks is ");
	        for (int i = 0; i < num; i++) 
	        {
	            System.out.println(a[i]);
	        }
	        
	    }
	
	}



