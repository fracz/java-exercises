package pl.edu.agh.java.exercises.arrays;

/**
 * Consider the leftmost and righmost appearances of some value in an array.
 * We'll say that the "span" is the number of elements between the two
 * inclusive. A single value has a span of 1. Returns the largest span found in
 * the given array. (Efficiency is not a priority.)
 * 
 * Przyjmijmy, że odstęp "span" danej wartości w tablicy to liczba elementów
 * pomiędzy pierwszym i ostatniem jej wystąpieniem, włączając je same. Jeśli
 * wartość pojawia się w tablicy tylko raz, jej "span" jest równe 1. Metoda
 * maxSpan powinna zwracać największy istniejący odstęp w zadanej tablicy.
 * 
 * @see http://codingbat.com/prob/p189576
 */
public class ArraySpan {
	public int maxSpan(int[] array) {

		int n = array.length;
		int i = 0;
		int j = 0;

		int maxSpan = 0;
		int tempMaxSpan = 0;
		for (i = 0; i < n; i++) {

			for (j = n-1; j >= i; j--) {

				if (array[i] == array[j]) {
					tempMaxSpan = j-i+1;
					if (tempMaxSpan > maxSpan) {
						maxSpan = tempMaxSpan;
					}
				}
			}

		}

		return maxSpan;



//		throw new UnsupportedOperationException();
	}
}
