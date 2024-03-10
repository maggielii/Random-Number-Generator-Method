package code;

public class RandomNumberGeneratorMethod {

	public static int randomNumber(int min, int max)
	{	
		int number = (int)(Math.random()*(max-min + 1)+ min);
		return number;
	}
	
	public static void main(String[] args)
	{
		for(int count = 0; count<100; count++)
		System.out.println( randomNumber(5,10) ); 
		
	}

}
