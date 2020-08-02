package algorithms;
import java.util.Scanner;

class sort
{
	void bubble(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
			for(int j=0;j<arr.length-1;j++)
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
}

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		sort s=new sort();
		s.bubble(arr);
		

	}

}
