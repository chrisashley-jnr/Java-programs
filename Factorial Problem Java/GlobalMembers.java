public class GlobalMembers
{
	/*problem definition:
	    Implement the factorial algorithm.
	analysis:
	    Accept an integer number as input as x
	    display the factorial of x
	    return 1 if x is < 2 else return x * factorial of (x -1)
	    Note this programs works for all values of x < 16
	    change the type of factorial to long
	design:
	    let factorial(x) be the function definition of type integer
	        and x be an argument of type integer
	
	    return x * factorial(x - 1)
	*/


	public static int factorial(int x)
	{
		if (x < 2)
		{
			return 1;
		}

		return x * factorial(x - 1);
	}

	public static void main(String[] args)
	{
		int x = 0;

		System.out.print("enter the value of x: ");
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		System.out.print("The factorial(");
		System.out.print(x);
		System.out.print(") = ");
		System.out.print(factorial(x));
		System.out.print("\n");

	}

}