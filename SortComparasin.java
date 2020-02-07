// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author Franklin
 *  @version HT 2020
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[])
    {
    	int length = a.length; 
        for (int i = 1; i < length; ++i) 
        { 
        	double numToSort = a[i]; 
            int leftIndex = i - 1; 
            while (leftIndex >= 0 && a[leftIndex] > numToSort) 
            { 
                a[leftIndex + 1] = a[leftIndex]; 
                leftIndex = leftIndex - 1; 
            } 
            a[leftIndex + 1] = numToSort; 
        } 
        return a;
    }//end insertion sort
	
	    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[])
    {
    	int length = a.length; 
    	
        for (int i = 0; i < length-1; i++) 
        { 
            int minIndex = i; 
            for (int j = i+1; j < length; j++) 
            {
            	if (a[j] < a[minIndex])  minIndex = j;
            }	 
            double temp = a[minIndex]; 
            a[minIndex] = a[i]; 
            a[i] = temp; 
        } 
        return a;
    }//end selectionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [ ] quickSort (double a[ ]){
    	int startIndex = 0;
    	int endIndex = a.length - 1;
    	sortInQuick(a, startIndex, endIndex) ;
    	return a;
    }//end quick sort

    static int partition(double a[ ], int startIndex, int endIndex) 
    { 
        double pivot = a[endIndex];
        int i = (startIndex-1); 
        for (int j = startIndex; j < endIndex; j++) 
        { 
            if (a[ j ] < pivot) 
            { 
                i++; 
                double temp = a[i]; 
                a[ i ] = a[ j ]; 
                a[ j ] = temp; 
            } 
        } 
        double temp = a[ i+1 ]; 
        a[ i+1 ] = a[endIndex]; 
        a[endIndex] = temp; 
  
        return i+1; 
    } 
    
    static void sortInQuick(double array[], int startIndex, int endIndex) 
    { 
        if (startIndex < endIndex) 
        { 
            int partitionIndex = partition(array, startIndex, endIndex); 
            sortInQuick(array, startIndex, partitionIndex-1); 
            sortInQuick(array, partitionIndex+1, endIndex); 
        } 
    }
    
    
    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double a[]) {
    	
	
    }//end mergesortIterative
    
    
    
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {
    	

	
   }//end mergeSortRecursive
    	
    static void sortInMergeRecur(double array[], int startIndex, int endIndex) 
    { 
        if (startIndex < endIndex) 
        { 
            int midIndex = (startIndex+endIndex)/2; 
            sortInMergeRecur(array, startIndex, midIndex); 
            sortInMergeRecur(array , midIndex+1, endIndex); 

            mergeInRecur(array, startIndex, midIndex, endIndex); 
        } 
    } 


   


    public static void main(String[] args) {

        //todo: do experiments as per assignment instructions
    }

 }//end class

