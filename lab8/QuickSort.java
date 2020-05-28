package vlsu;

public  class QuickSort {
    public static void sort(int[] arr)
	    {
      	        sortRec(arr, 0, arr.length - 1);
      }

       	    private  static void sortRec(int[] arr, int left, int right)
	    {
       	        if (left < right)
            	        {
             	            int midle = partition(arr, left, right);
             	            sortRec(arr, left, midle - 1);
            	            sortRec(arr, midle + 1, right);
            	        }
        	    }
      	    private static int partition(int[] arr, int left, int right)
	    {
        	        int midle = arr[right];
     	        int middle = left;
        	        for (int  i = left; i < right; i++)
          	        {
         	            if (arr[i] <= midle)
                            {
               	                swap(arr, i, middle);
                	                middle++;
                        }
          	        }
       	        swap(arr, middle, right);
       	        return middle;
      	    }

          private static void swap (int[] arr, int a, int b)
 	    {
        	        if(a != b)
           	        {
            	            int temp = arr[a];
          	            arr[a] = arr[b];
          	            arr[b] = temp;
        	        }
     	    }
	}


