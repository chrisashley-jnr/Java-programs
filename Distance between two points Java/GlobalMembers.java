public class GlobalMembers
{
	/*Problem definition:
	    find the distance between two points, A and B
	Analysis:
	    If A and B are the points of ineterest, then
	    let Ax and Ay, Bx and By be the xy-coordinates of A and B respectively.
	    If D is the distance betweem A and B,
	        then D = the square root of the sum of the squares of the differences
	        between the x-coordinates and the y-coordinates
	    Thus
	        the inputs are Ax, Ay, Bx and By.
	        the output will be D
	        and D = sqrt(pow(Ax - Bx, 2) + pow(Ay - By, 2))
	*/


	public static void main(String[] args)
	{
		float Ax;
		float Ay;
		float Bx;
		float By;
		float D;

		System.out.print("Enter x-coordinate for A: ");
		Ax = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));

		System.out.print("Enter y-coordinate for A: ");
		Ay = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));

		System.out.print("Enter x-coordinate for B: ");
		Bx = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));

		System.out.print("Enter y-coordinate for B: ");
		By = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));

		D = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2));

		System.out.print("The distance between A(");
		System.out.print(Ax);
		System.out.print(", ");
		System.out.print(Ay);
		System.out.print(") and ");
		System.out.print(" B(");
		System.out.print(Bx);
		System.out.print(", ");
		System.out.print(By);
		System.out.print(") is ");
		System.out.print(D);
		System.out.print("\n");

	}

}