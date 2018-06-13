package com.teja.QuickSort_Maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int arr[]=new int[]{3,4,1};
        new App().sort(arr,0, 2);
        System.out.println(arr[0]);
    }
    
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); 
        for (int j=low; j<high; j++)
        {
           
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
           
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    
    int[] quickSort(int arr[])
    {
    	sort(arr,0,arr.length-1);
    	return arr;
    }
}
