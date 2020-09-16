
import java.util.Scanner;
public class Mergesort{
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
		merge(a,0,n-1);
		System.out.println("After sorting............");
		for(int j : a)
			System.out.print(j+" ");
	}
	public static void merge(int[] a,int lb,int ub){
		if(lb<ub){
			int mid=(lb+ub)/2;
			merge(a,lb,mid);
			merge(a,mid+1,ub);
			mergeSort(a,lb,mid,ub);
		}
	}
	public static void mergeSort(int[] a,int lb,int mid,int ub){
		int i = lb;
		int j = mid+1;
		int k=lb;
		int[] b = new int[20];
		while(i<=mid && j<=ub){
			if(a[i]>=a[j]){
				b[k] =a[j];
				j++;
				k++;
			}
			else{
				b[k] = a[i];
				i++;
				k++;
			}
		}
		while(j<=ub){
			b[k]=a[j];
			k++;j++;
		}
		while(i<=mid){
			b[k]=a[i];
			k++;i++;
		}
		for(int l=lb;l<=ub;l++)
			a[l] = b[l];
	}
}