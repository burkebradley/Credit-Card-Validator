import java.util.Scanner;
public class CreditCardScanner
	{
		
		static Scanner userInputOne = new Scanner(System.in);
		static Scanner userInputTwo = new Scanner(System.in);
		static long sum;
		static long [] creditCardNumber = new long [16];
		public static void main(String[] args)
		{
			System.out.println("Enter in a credit card number.");
			long number = userInputTwo.nextLong();
			for (int i = 15; i>=0;i--)
				{
					creditCardNumber [i]= number%10;
					number=number/10;
				}
			
			alternatingDigits();
			validator();
			
		}
		
		public static void alternatingDigits()
			{
				long firstNumber = 0;
				long lastNumber = 0;
				for(int i = 0; i < 16; i=i+2)
					{
						creditCardNumber[i] = creditCardNumber[i]*2;
						if (creditCardNumber[i]>=10)
							{
								firstNumber = creditCardNumber[i]%10;
								lastNumber = creditCardNumber[i]/10;
								creditCardNumber[i] = firstNumber+lastNumber;
							}		
					}
			}
		public static void validator()
		{
			sum = 0;
			for(int i = 0; i <16; i++)
				{
					sum = creditCardNumber[i]+sum;
				}
			System.out.println(sum);
			if (sum%10==0)
				{
					System.out.print("This is a valid credit card.");
				}
			else
				{
					System.out.println("This is not a valid credit card.");
				}
		}
	}
