package com.app.mergeSort;

public class MergeSort {
	
	public static void mergeSort(int[] arr, int left,int right) {
		
		int mid=(left+right)/2;
		
		if(left>=right) {
			return;
		}
		
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		
		int[] temp=new int[right-left+1];
		int i=left,j=mid+1,k=0;
		
		while(i<=mid&&j<=right) {
			if(arr[i]<=arr[j]) {
				temp[k++]=arr[i++];
			}else {
				temp[k++]=arr[j++];
			}
		}
		
		while(j<=right) {
			temp[k++]=arr[j++];
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		
		for(int l=0;l<temp.length;l++) {
			arr[left+l]=temp[l];
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {24,38,12,52,4,56,98};
		
		mergeSort(arr, 0, arr.length-1);
		
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
}
