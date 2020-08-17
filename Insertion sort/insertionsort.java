package algorithms;
import java.util.*;

class iSort
{
	void insertion(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
	}
	
}

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		iSort s=new iSort();
		s.insertion(arr);
		System.out.print("The Sorted order of the given input is -: ")
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		

	}

}
