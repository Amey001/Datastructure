package com.app.Sortings;

public class BubbleSort {

	public static void main(String[] args) {
	
		
		int [] arr= {7,8,3,2,1};		//unsorted array 
		
		//bubble sort
		//time complexity :: O(n^2)
		//outer loop till n-1 
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-i-1; j++)
			{
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println(" sorted array :: ");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}
