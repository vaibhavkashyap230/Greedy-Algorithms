// https://practice.geeksforgeeks.org/problems/-minimum-number-of-coins/0

import java.util.*;

class GFG
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0)
		{
			int n = sc.nextInt();
			for(int i=0;i<n/2000;i++)
			{
				System.out.print(2000+" ");
			}
			n = n%2000;
			for(int i=0;i<n/500;i++)
			{
				System.out.print(500+" ");
			}
			n = n%500;
			for(int i=0;i<n/200;i++)
			{
				System.out.print(200+" ");
			}
			n = n%200;
			for(int i=0;i<n/100;i++)
			{
				System.out.print(100+" ");
			}
			n = n%100;
			for(int i=0;i<n/50;i++)
			{
				System.out.print(50+" ");
			}
			n = n%50;
			for(int i=0;i<n/20;i++)
			{
				System.out.print(20+" ");
			}
			n = n%20;
			for(int i=0;i<n/10;i++)
			{
				System.out.print(10+" ");
			}
			n = n%10;
			for(int i=0;i<n/5;i++)
			{
				System.out.print(5+" ");
			}
			n = n%5;
			for(int i=0;i<n/2;i++)
			{
				System.out.print(2+" ");
			}
			n = n%2;
			for(int i=0;i<n/1;i++)
			{
				System.out.print(1+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
