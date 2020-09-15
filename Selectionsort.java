import java.io.*;
import java.util.Scanner;
public class Selectionsort{
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
		selectionSort(a,n);
		System.out.println("After sorting............");
		for(int j : a)
			System.out.print(j+" ");
	}
	public static void selectionSort(int[] a,int n){
		int j,i,min,temp;
		for(i=0;i<n-1;i++){
			min = i;
			for(j=i+1;j<n;j++){
				if(a[j]<a[min])
					min = j;
			}
			if(min!=i){
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
	}
}