import java.io.*;
import java.util.Scanner;
public class Binarysearch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = {5,7,43,12,56,434,54,2,8};
		System.out.println("Enter the element to be searched");
		int number = input.nextInt();
		int pos = binarySearch(a,number,0,8);
		if(pos==-1)
			System.out.println("Element is not found");
		else
			System.out.println("Element " + number + " is found at position : "+pos);
	}
	public static int binarySearch(int[] a,int number,int lb,int ub){
		int mid=0;
		while(lb<=ub){
			mid = (lb+ub)/2;
			if(number==a[mid])
				return mid+1;
			else if (number<a[mid])
				ub--;
			else
				lb++;
		}
		return -1;
	}

}
