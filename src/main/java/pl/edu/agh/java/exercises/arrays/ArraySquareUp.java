package pl.edu.agh.java.exercises.arrays;

/**
 * Given n>=0, create an array length n*n with the following pattern, shown here
 * and in the unit tests: for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 * Dla zadanego n>=0 zwróć tablicę o długości n*n utworzoną wg wzoru podanego
 * tutaj oraz w testach jednostkowych: dla n=3: {0, 0, 1, 0, 2, 1, 3, 2, 1}
 * 
 *
 * @see http://codingbat.com/prob/p155405
 */
public class ArraySquareUp {
	public int[] squareUp(int n) {

		int[] array = new int[n * n];
		int number = 0;
		int lenArr = n * n;
		int limit = n;
		if (n == 0) {
			return array;
		}

		for (int i = lenArr - 1; i >= 0; i-=n) {

			for (int j = 0; j < limit; j++) {
				number += 1;
				array[i - j] = number;
			}
			number = 0;
			limit--;
		}
		return array;

//		throw new UnsupportedOperationException();
	}
}
