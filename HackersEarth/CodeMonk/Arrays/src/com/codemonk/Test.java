package com.codemonk;

public class Test {

	public static void main(String args[])
	{
	   
		//One Dimensional Array
		/*int arr[ ] = { 2, 3, 5, 4, 6, 7 };
	   for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);*/
		
		//Two Dimensional Array
		/*int[][] arr1={{1,2},{1,3},{1,4}};
		for (int i=0;i<3;i++)
			for(int j=0;j<2;j++)
	    System.out.print(arr1[0][1]);*/
		
		//Adding up
		int arrAdd[]={1,2,4,5,6,7};
		int sum=0;
		for(int i=2;i<6;i++)
			sum=sum+i;
	
		System.out.println("Sum of indicies from 2 to 5" +sum);
	}
	
	
}
