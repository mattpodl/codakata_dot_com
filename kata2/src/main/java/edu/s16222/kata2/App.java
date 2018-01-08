package edu.s16222.kata2;


public class App
{
	public int chop(int x, int[] arrayX) {

		if (arrayX == null || arrayX.length == 0) {
			return -1;
		}
		if (arrayX[arrayX.length/2] == x) {
			return arrayX.length/2;
		}
		int minIndex = 0, maxIndex = arrayX.length - 1;

		while(minIndex < maxIndex) {

			if (arrayX[(maxIndex - minIndex)/2 + minIndex] > x) {
				maxIndex = (maxIndex - minIndex)/2 + minIndex - 1;
			} else {
				minIndex =  (maxIndex - minIndex)/2 + minIndex + 1;
			}
			if (arrayX[(maxIndex - minIndex) / 2 + minIndex] == x) {
				return (maxIndex - minIndex)/2 + minIndex;
			}
		}
		return -1;
	}
	public static void main( String[] args )
	{


	}
}
