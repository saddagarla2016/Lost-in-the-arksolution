import java.util.*;

public class cas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = {54,40,37,64,81,15,65,72,61,57,83,3,67,
				12,30,54,11,51,3,78,48,31,68,77,64,68,95,68,35,82
				,57,26,67,41,47,80,36,88,5,9,55,87,77,8,65,31,7,79,
				49,22,32,94,34,12,20,30,91,12,57,77,37,96,22,29,17,
				76,36,56,80,33,20,65,57,40,50,97,20,92,25,14,19,84,12,
				62,20,42,99,52,88,29,75,48,27,73,46,72,48,84,19,55};
		
		// Summing all elements
	      int total = 0;
	      for (int i = 0; i < myList.length; i++) {
	         total += myList[i];
	      }
	      System.out.println("Total is " + total);
	      
	      // Finding the largest element
	      int max = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] > max) max = myList[i];
	      }
	      System.out.println("Max is " + max);  
	   
	      //Finding the number in the list
	      
	      System.out.println("The number of numbers in the list is: " + myList.length);
	      
	      int average; 
	      average = total/myList.length;
	      System.out.println("The average is: " + average);
	      
	   // Finding the largest element
	      int min = myList[0];
	      for (int i = 1; i < myList.length; i++) {
	         if (myList[i] < min) min = myList[i];
	      }
	      System.out.println("Min is " + min); 

	}

}
