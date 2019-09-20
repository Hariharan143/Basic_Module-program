package armstrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		int num,Count=0,a,b,c,q,result=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		num=s.nextInt();
		a=num;
		c=num;
		while(num!=0);
		{
			Count++;
			num=num/10;
		}
		while(a>0);
		{
			b=a%10;
			a=a/10;
			q=(int)Math.pow(b,Count);
			result=result+q;
		}
		if (c==result)
		System.out.println("no is armstrong");
		else
		System.out.println("no is not armstrong");
		}
		
	}


