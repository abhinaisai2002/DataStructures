import java.io.*;
import java.util.Scanner;
public class Binarysearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter the element to be searched");
		int number = input.nextInt();
		int pos = binarySearch(a,number,0,8);
		if(pos==-1)
			System.out.println("Element is not found");
		else
			System.out.println("Element " + number + " is found at position : "+pos);
	}
	

}
/* fuck java*/
