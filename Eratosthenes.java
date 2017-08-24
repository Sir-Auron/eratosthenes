import java.util.ArrayList;
import java.util.Scanner;

public class Eratosthenes {
	public static void main(String args[]){
		
		///// Definitions /////
		Scanner limit = new Scanner(System.in);															// Scanner
		int i, S, idx, x, L;																			// Variables
		ArrayList<Integer> Interval = new ArrayList<Integer>();											// Array with all numbers
		ArrayList<Integer> prime = new ArrayList<Integer>();											// Array with prime numbers
		
		
		///// Input /////
		System.out.println("Enter the boundary to what you want to determine the prime numbers");		// Display text
		S = limit.nextInt();																			// Assignment of input

		
		///// Fill array with all numbers /////
		for(i=0; i <= S-2; ++i){							// 1 is left out because it's no prime number
			Interval.add(i+2);
		}
		
		
		///// Main process /////
		while(!Interval.isEmpty()){							// Loop stops when all numbers are checked
			prime.add(Interval.get(0));						// first element left is always a prime number
			x = Interval.get(0);							// assign first element of current array
			L = Interval.size();							// define limit for 2nd while loop
			/// Just to verify variables ///
			System.out.println(prime);
			System.out.println(x);
			System.out.print("The length is ");
			System.out.println(L);
			
			while(x <= L){
				x = x + Interval.get(0);					// calculate multiples
				idx = Interval.indexOf(x);					// search position of multiples
				Interval.remove(idx);						// remove multiples
				System.out.println(x);
				System.out.println(Interval);
			}
			
			Interval.remove(0);								// remove processed prime number from array
			System.out.println(Interval);
			System.out.println(prime);						// check array with prime numbers
		}
		
		
		///// Output of the correct array /////
		System.out.print("The final prime numbers are:");
		System.out.println(prime);
		
		
		///// Close Scanner /////
		limit.close();
	}
}
