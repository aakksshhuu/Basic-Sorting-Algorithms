package algorithms;

import java.util.Scanner;

class mSort{
	void mergeSort(int arr[], int l, int h)
	{
		
		if(l<h)
		{
			int m=(l+h)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,h);
			merge(arr,l,m,h);
		}
		
	}
	void merge(int arr[],int l,int m,int h)
	{
		int n1=m-l+1;
		int n2=h-m;
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		for(int i=0;i<n1;i++)
			arr1[i]=arr[l+i];
		for(int i=0;i<n2;i++)
			arr2[i]=arr[m+i+1];
		int j=0,k=l,i=0;
		while(i<n1&&j<n2)
		{
			if(arr1[i]<arr2[j])
			    arr[k++]=arr1[i++];
			else
				arr[k++]=arr2[j++];
		}
		while(i<n1)
			arr[k++]=arr1[i++];
		while(j<n2)
			arr[k++]=arr2[j++];
	}
	
}

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		mSort s=new mSort();
		s.mergeSort(arr,0,n-1);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]);
	}

}
