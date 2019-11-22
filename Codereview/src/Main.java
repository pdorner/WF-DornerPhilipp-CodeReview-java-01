import java.util.Scanner;

public class Main {
	//Point 1
	public static void main(String[] args) {
		// Point 2 First Rectangular 
		Scanner sc = new Scanner(System.in);
		int s1 = 5;
		int s2 = 2;
		int rectangularArea = s1 * s2;
		System.out.println("The Rectangular with 2 height and 5 width has a area of: " + rectangularArea + " m²");
		/////////////////////////////////////////
		// Point 3
		System.out.println(
				"A Rectangular with 20cm width and 30cm height has a area of: " + calculateRectArea(20, 30) + " cm²");
		System.out.println(
				"A Rectangular with 40cm width and 50cm height has a area of: " + calculateRectArea(40, 50) + " cm²");
		
		/////////////////////////////////////////
		// Point 5 User puts in multi Squares and Rect.
		for (int i = 0; i < 3; i++) {
			System.out.print("Please insert the width of a Spuare ");
			int z = sc.nextInt();
			// Point 4
			System.out.println("The Spuare has area of: " + calculatesquareArea(z) + " m² and has a Perimeter of: "
					+ calculatesquarePerimeter(z) + "m");
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("Please insert the height of a Rectangular ");
			int x = sc.nextInt();
			System.out.print("Please insert the width of a Rectangular ");
			int y = sc.nextInt();
		}
		
		//Bonus Point 1
		int [] arr1 = {4, 2, 6, 5};
		int [] arr2 = {7, 8, 2, 4};
		for (int i = 0; i<arr1.length; i++) {
			System.out.println("The Area of the of the Array Square " + (i+1) + " is " + calculateRectArea(arr1[i], arr2[i]));
		}

		//Bonus Point 2
		int sum = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
		System.out.println("The Area of the Startingparameter Square is: " + sum);

	}
	
	// Meth Point 3
	public static int calculateRectArea(int x, int y) {
		int sum = x * y;

		return sum;
	}

	// Meth Point 4
	public static int calculatesquareArea(int z) {
		int sum = z * z;

		return sum;
	}

	// Meth Point 4
	public static int calculatesquarePerimeter(int z) {
		int sum = z * 4;

		return sum;
	}

}
