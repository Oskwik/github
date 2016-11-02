import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {

		
		double fahrenheit, celsius;
		
		Scanner scan= new Scanner(System.in);
		boolean errorCheck = true;
		
		while(errorCheck)
			{
			
		
		try
		{
		
		System.out.println("Skriv in graderna i fahrenheit! ");
		String input=scan.nextLine();
		fahrenheit=Double.parseDouble(input);
		celsius = (fahrenheit-32)*(0.5556);
		
		System.out.println(fahrenheit +" grader fahrenheit blir: "+ celsius%d + " grader celsius ");
		errorCheck = false;
		}
		catch(NumberFormatException exept)
		{
			System.out.println("Försök igen och denna gång använd siffror idiot!");
			
			
			
		}
			}
	}

}
