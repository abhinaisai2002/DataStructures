import java.io.*;
import java.util.Scanner;
public class Bubblesort{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a;
		int i;
		System.out.print("Enter the no.of elements of an array : ");
		int n = input.nextInt();
		a = new int[n];
		System.out.println("Enter array elements : ");
		for(i=0;i<n;i++){
			a[i] = input.nextInt();
		}
		System.out.println("Before sorting............");
		for(int j : a)
			System.out.print(j+" ");
		System.out.println();
		bubbleSort(a,n);
		System.out.println("After sorting............");
		for(int j : a)
			System.out.print(j+" ");
	}
	public static void bubbleSort(int[] a,int n){
		int i,j,temp,flag;
		for(i=0;i<n-1;i++){
			flag = 0;
			for(j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = 1;
				}
			}
			if(flag==0)
				break;
		}
	}
}