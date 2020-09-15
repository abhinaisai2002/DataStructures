import java.io.*;
import java.util.Scanner;
public class Insertionsort{
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
		insertionSort(a,n);
		System.out.println("After sorting............");
		for(int j : a)
			System.out.print(j+" ");
	}
	public static void insertionSort(int[] a,int n){
		int i,j,temp;
		for(i=1;i<n;i++){
			temp = a[i];
			j = i-1;
			while(j>=0 && a[j] > temp){
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = temp;
		}
	}
}