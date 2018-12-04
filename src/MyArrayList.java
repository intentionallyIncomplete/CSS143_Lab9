import java.util.*;

/**
 * Class description:
 * @author Ian Bryan
 * @version Dec 3rd, 2018
 * 
 * This class implements multiple sort algorithms to be used with ints, chars, and Stings.
 * Bubble sort, Selection sort, and Insertion sorts are implemented here.
 */
public class MyArrayList implements Comparable<MyArrayList>{

	// instance data
	protected int[] IntList;
	protected char[] CharList;
	protected String[] StringList;

	// constructor will build all 3 arrays here
	public MyArrayList() {
		this.IntList = new int[10];
		this.CharList = new char[10];
		this.StringList = new String[5];

		// fill all 3 arrays with data
		for(int i = 0; i < IntList.length; i++) {
			IntList[i] = (int) (Math.random()*52);
		}

		// Populate char array
		for(int i = 0; i < CharList.length; i++) {

			Random random = new Random();
			CharList[i] = (char)(random.nextInt(26) + 'a');
		}

		// Populate String array
		StringList[0] = "joe";
		StringList[1] = "mark";
		StringList[2] = "abbey";
		StringList[3] = "tony";
		StringList[4] = "kevin";    
	}

	/**
	 * @param other
	 * @return - Returns the value of -1 to 1 for less than, equal to, or greater
	 * than a compared value during evaluation.
	 */
	@Override
	public int compareTo(MyArrayList other) {
		if(this.IntList[0] < other.IntList[0]) {
			System.out.println("compareTo() is returning -1, array[0] < other[0]"); 
			return -1;
		}else if(this.IntList[0] > other.IntList[0]) {
			System.out.println("compareTo() is returning 1, array[0] > other[0]");
			return 1;
		}else {
			System.out.println("compareTo() is returning 0, array[0] != other[0] ");
			return 0;
		}
	}


	/**
	 * Method for sorting integers using Bubble Sort method.
	 */
	public void intBubbleSort() {
		for (int i = 0; i < IntList.length-1; i++) {
			for (int j = 0; j < IntList.length-i-1; j++) {
				if (IntList[j] > IntList[j+1]) { 
					swapInts(IntList,j);
				} 
			}
		}
	}


	/**
	 * Same method as with integers, but with characters.
	 */
	public void CharBubbleSort() {
		for (int i = 0; i < CharList.length-1; i++) {
			for (int j = 0; j < CharList.length-i-1; j++) {
				if (CharList[j] > CharList[j+1]) { 
					swapChars(CharList,j);
				} 
			}
		}
	}

	/**
	 * Same method as with integers, but with Strings.
	 */
	public void stringBubbleSort() {
		for (int i = 0; i < StringList.length-1; i++) {
			for (int j = 0; j < StringList.length-i-1; j++) {
				if (StringList[j].compareToIgnoreCase(StringList[j+1]) > 0) { 
					swapStrings(StringList,j);
				} 
			}
		}
	}


	/**
	 * @param intList
	 * @param j
	 */
	public void swapInts(int[] intList, int j) { 
		int temp = intList[j]; 
		intList[j] = intList[j+1]; 
		intList[j+1] = temp;
	}

	/**
	 * @param charList
	 * @param j
	 */
	public void swapChars(char[] charList, int j) { 
		char temp = charList[j]; 
		charList[j] = charList[j+1]; 
		charList[j+1] = temp;
	}

	/**
	 * @param stringList
	 * @param j
	 */
	public void swapStrings(String[] stringList, int j) { 
		String temp = stringList[j]; 
		stringList[j] = stringList[j+1]; 
		stringList[j+1] = temp;
	}

	/**
	 * 
	 */
	public void selectionSort() {
		// Implement your sort, call swapSelection(int[] intList, int i, int nextMin) 
	}

	//selection sort for Strings
	/**
	 * 
	 */
	public void stringSelectionSort() {
		// Implement your sort, call swapSelectionStrings(String[] StringList, int i)
		// and findSmallest(IntList, i, IntList.length) from your method
	}

	/**
	 * @param intList
	 * @param i
	 * @param nextMin
	 */
	public void swapSelection(int[] intList, int i, int nextMin) { 
		// Your code here to swap int values
	}

	/**
	 * @param StringList
	 * @param i
	 */
	public void swapSelectionStrings(String[] StringList, int i) { 
		// Your code here to swap values
	}



	/**
	 * @param arr
	 * @param begin
	 * @param end
	 * @return
	 */
	public int findSmallest(int[] arr, int begin, int end) {
		//returns the index of the smallest element
		int minIndex = begin;       //hint
		for(int i = begin; i < end ; i++) {
			if(arr[begin - 1] < arr[begin]) {
				minIndex = begin;
			} else 
				minIndex = begin - 1;
		}
		return minIndex;
	}

	/**
	 * 
	 */
	public void insertionSort() {

		for(int i = 0; i < IntList.length - 1; i++) {
			//note -1 above since we’re dealing with neighbors (a, a+1)
			int current = IntList[i];
			//int hole = i;
			
			while(i > 0 && IntList[i - 1] > current){ //while “out of place”
				//slide data to the left moving the “hole” left
				.
				.  // more code goes here
				.
				.
			}
		}
	}
}



