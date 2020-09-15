import java.io.*;
import java.util.Scanner;

public class Linearsearch{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = {5,4,6,24,12,34,542,1};
		System.out.println("Enter the element to be searched");
		int number = input.nextInt();
		int pos = search(a,number,8);
		if(pos==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element "+number+" found position "+pos);
	}
	public static int search(int[] a,int number,int n) {
		int i;
		for(i=0;i<n;i++) {
			if(a[i] == number)
				return i+1;
		}
		return -1;
	}
}
