package com.sharpenr;

import java.util.ArrayList;

public class Subarray {

	public static void printSubsequences(int[] arr, int index,
            ArrayList<Integer> path) {
	    if (index == arr.length)
	    {
	        if (path.size() > 0)
	            System.out.println(path);
	    }
	    else
	    {
	      printSubsequences(arr, index + 1, path);
	         
	        path.add(arr[index]);
	         
	        printSubsequences(arr, index + 1, path);
	        path.remove(path.size() - 1);
	    }
	    return;
	}
	public static void main(String[] args)
	{
	    int[] arr = { 1, 2, 3 };
	       
	      ArrayList<Integer> path = new ArrayList<>();
	       
	      printSubsequences(arr, 0, path);
	}
}






