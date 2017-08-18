import java.util.Scanner;

public class Weather_code
{

	public static void main(String[] args)
	{
		System.out.println("Welcome! Please type in your temperature in the box below.");
		
		Scanner cin = new Scanner (System.in);
		
		//System.out.println(x);
		
		int m = cin.nextInt();
		if (m<=32)
		{
			System.out.println("That's cold!");
		}
		else if (m>=90)
		{
			System.out.println("That's hot!");
		}
		double ans = 0;
		
		ans= ((m-32)*.5555555555556);
		
		System.out.println("The temperaure is " + (double)ans + " in Celsius!");
		
		cin.close();
	}

}
