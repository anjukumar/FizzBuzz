
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		for( x = 1 ; x <=100; x++)
		{
			if (x%3 == 0 && x%5 == 0)
			{
			System.out.println("FIZZBUZZ");
			}
			else if(x% 3== 0)
			{
				System.out.println("Fizz");
			}
			else if (x% 5== 0)
			{
				System.out.println("Buzz");
			}
			else 
			{
				System.out.println(x);
			}
		}
	}

}
