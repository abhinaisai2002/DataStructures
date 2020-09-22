import java.io.*;
import java.util.Scanner;
public class QuickSort{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] a;
        System.out.print("Enter the size of the array : ");
        int n = input.nextInt();
        a = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0 ; i <n ;i++)
            a[i] = input.nextInt();
        System.out.println("Before Sorting........");
        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        quickSort(a,0,n-1);
        System.out.println("After Sorting........");
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
    public static void quickSort(int[] a ,int l,int r){
        int left=l;
        int pivot = l;
        int right = r;
        while(left!=right){
            while(a[right]>=a[pivot] && left!=right)
                right--;
            if(left!=right){
                int temp = a[pivot];
                a[pivot] = a[right];
                a[right] = temp;
                pivot = right;
            }
            while(a[left]<a[pivot] && left!=right)
                left++;
            if(left!=right){
                int temp = a[pivot];
                a[pivot] = a[left];
                a[left] = temp;
                pivot = left;
            }
        }    
        if(l<pivot)
            quickSort(a, l, pivot-1);
        if(pivot < r)
            quickSort(a, pivot+1, r);
    }
}

