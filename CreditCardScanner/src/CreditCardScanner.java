import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CreditCardScanner
	{
		
		static Scanner userInputOne = new Scanner(System.in);
		static Scanner userInputTwo = new Scanner(System.in);
		static long sum;
		static long validCreditCard=0;
		static long [] creditCardNumber = new long [16];
		public static void main(String[] args) throws IOException
		{
			System.out.println("Would you like to enter in your own credit card number or to inport a text file?");
			System.out.println("Press 1 to enter your own or press 2 to inport a file.");
			long userChoice = userInputTwo.nextLong();
			
			if (userChoice == 1)
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
			else
				{
				readTextFile();
				}
			
		}
		
		public static void alternatingDigits() throws IOException
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
		
//		public static void tellUser()
//			{
//				System.out.println(creditCardNumber);
//				System.out.println("There are " + validCreditCard + " valid credit cards.");
//			}
		public static void validator() throws IOException 
		{
			sum = 0;
			
			for(int i = 0; i <16; i++)
				{
					sum = creditCardNumber[i]+sum;
				}
//			System.out.println(sum);
			if (sum%10==0)
				{
					System.out.print("This is a valid credit card.");
					validCreditCard++;	
				}
			else
				{
					System.out.println("This is not a valid credit card.");
				}
			for (int )
//			tellUser();
		}
		
		
		
		public static void readTextFile() throws IOException
		{
			Scanner file = new Scanner(new File("creditCardNumbers.txt"));
			while (file.hasNext())
				{
					sum = file.nextLong();
					alternatingDigits();
					validator();
				}
		}
	}
