package collagenew;

import java.util.Scanner;

public class Trainabc {

	public static void main(String[] args) {
		String Name;
		String Age;
		String Degree;
		String Branch;
		String Contact_no;
		Scanner sc=new Scanner(System.in);
	
System.out.println("enter your Name");
Name=sc.nextLine();
System.out.println("enter your Age");
Age=sc.nextLine() ;
System.out.println("enter your Degree");
Degree=sc.nextLine();
System.out.println("enter your Branch");
Branch=sc.nextLine();
System.out.println("enter your Contact_no");
Contact_no=sc.nextLine();

System.out.println("Name:"+Name);
System.out.println("Age:"+Age);
System.out.println("Degree:"+Degree);
System.out.println("Branch:"+Branch);
System.out.println("Contact_no:"+Contact_no);
	}

}
