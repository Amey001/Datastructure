package com.app.Sortings;

public class InsertionSort {

	public static void print(int []arr)
	{
		//printing the array
				System.out.print("[");
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(" "+arr[i]+" ");
				}
				System.out.println("]");
	}
	
	public static void main(String[] args) {
		
		int [] arr= {7,10,2,78,43,23,9};
		
		print(arr);
		//insertion sort 
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && temp<=arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;
		}
		print(arr);
	}

}
