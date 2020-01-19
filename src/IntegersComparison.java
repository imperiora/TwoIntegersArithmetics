import java.util.Scanner;

public class IntegersComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.print("Input 1st integer: ");
		int oneinteger = input1.nextInt();

		Scanner input2 = new Scanner(System.in);
		System.out.print("Input 2nd integer: ");
		int secinteger = input2.nextInt();
		{
			int sum = 0;
			sum = oneinteger + secinteger;

			int diff = 0;
			diff = oneinteger - secinteger;

			int prod = 0;
			prod = oneinteger * secinteger;

			double ave = 0;
			ave = (oneinteger + secinteger) / 2;

			int dist = 0;			
			dist = oneinteger - secinteger;
			if(dist<0) {
				dist = dist*(-1);
			}
			
			int max = 0;
			int min = 0;

			if (oneinteger > secinteger) {
				max = oneinteger;
				min = secinteger;
			} else if (oneinteger <= secinteger) {
				max = secinteger;
				min = oneinteger;
			} else {
				max = 0;
				min = 0;
			}
			System.out.println("Sum of two integers: " + sum);
			System.out.println("Difference of two integers: " + diff);
			System.out.println("Product of two integers: " + prod);
			System.out.println("Average of two integers: " + ave);
			System.out.println("Distance of two integers: " + dist);
			System.out.println("Max integer: " + max);
			System.out.println("Min integer: " + min);
		}
	}

}
