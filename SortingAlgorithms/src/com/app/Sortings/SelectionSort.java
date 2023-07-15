package com.app.Sortings;

public class SelectionSort {
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
		//selection sort
		int [] arr= {7,23,56,13,9,1};
		print(arr);
		//outer loop runs till n-1
		for(int i=0;i<arr.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;	
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		
		//printing sorted array
		print(arr);
	}
}
