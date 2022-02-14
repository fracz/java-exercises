package pl.edu.agh.java.exercises.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Given an array, return true if there is a place to split the array so that
 * the sum of the numbers on one side is equal to the sum of the numbers on the
 * other side.
 * 
 * Dla zadanej tablicy zwróć true, jeśli da się tak rozmieścić jej elementy, że
 * suma jej elementów w lewej i w prawej połowie będzie równa.
 * 
 * @see http://codingbat.com/prob/p158767
 */
//wg wersji angielskiej

public class ArrayBalance {
	public boolean canBalance(int[] array) {

		int n = array.length;

		int magicSumP = 0;
		int magicSumL = 0;

		if(array.length==0 ){
			return true;
		}
		for (int i = 0; i < n; i++) {
			magicSumP += array[i];
//			System.out.println("magic right " + magicSumP);
			for (int j = n - 1; j > i; j--) {
				magicSumL += array[j];
//				System.out.println("magic left" + magicSumL);
			}
			if (magicSumP == magicSumL) {
//
//				System.out.println("table can be split after item " + (i + 1) + " and sum of right side is equal to "
//						+ magicSumP + " " + magicSumL);
				return true;

			}
			magicSumL = 0;
		}

		return false;
//		throw new UnsupportedOperationException();
	}

//	public  void main (String[] args){
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Provide no of elements and i will an array with random numbers");
//		int size =scanner.nextInt();
//		int [] array = new int [size];
//
//		for( int i = 0; i<size;i++){
//			Random random = new Random();
//			int randomNumber = random.nextInt(10);
//			array[i] = randomNumber;
//		}
//
//		System.out.println("Your table -> "+Arrays.toString(array));
//		boolean result = canBalance(array);
//
//	}

}
