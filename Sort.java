/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
public class Sort <T> {
    // aqui van todos los sorts
    
    public IComparator myCompare;
	
	/**
	 * Constructor of Sort Class, a Icomparator object is necessary to create 
	 * a object of this class
	 * @param _Compare a class that implements IComparator interface necessary
	 * to know how compare the elements of generic arrays. 
	 */
	public Sort(IComparator _Compare) {
		myCompare = _Compare;
	}
    
    
    public void quickSort(int[] myArray, int inf, int sup) {
	   int i = inf - 1;
	   int j = sup;
	   boolean flag = true;
	   int temp;
	   
	   
	   if (inf >= sup) {
		   return;
	   }
	   
	   int elem_div = myArray[sup];
	   
	   
	   while (flag) {
		   while(myCompare.Compare(myArray[++i], elem_div) < 0); //Move the index i until it finds an element bigger than elem_div
		   while((myCompare.Compare(myArray[--j], elem_div) > 0)  && (j > inf)); //Move the index j until it finds element smaller than elem_div
		   
		   if (i < j) {
			   temp = myArray[i];
			   myArray[i] = myArray[j];
			   myArray[j] = temp;
		   } else {
			   flag = false;
		   }
	   }
    }
    
    public void radixSort (int [] arreglo){
        int x,i,j;
        int tamano = arreglo.length;
        
        for (x = Integer.SIZE-1; x>=0; x-- ){
            
            
            int auxiliar[] = new int[arreglo.length];
            j=0;
            
            for(i=0 ; i< tamano;i++){
                boolean mover = arreglo[i] << x >=0;
                if(x==0 ? !mover:mover){
                    auxiliar[j]=arreglo[i];
                    j++;
                }else{
                    arreglo[i-j]=arreglo[i];
                }
     
            }
            for(i=j;i<auxiliar.length;i++){
                auxiliar[i]=arreglo[i-j];
            }
            arreglo=auxiliar;
        }
        
    }

    /***
	 * Sorts the specified array of objects using the bubble
	 * sort algorithm.
	 * @param arreglo List of elements need to be sorted
	 */
    public void BubbleSort(int[] arreglo) {
		for (int i = 0; i < arreglo.length - 1; i++) {					
			for (int j = i + 1; j < arreglo.length; j++) {				
				if (myCompare.Compare(arreglo[i], arreglo[j]) > 0) {    
					int temp = arreglo[i];								
					arreglo[i] = arreglo[j];							
					arreglo[j] = temp;									
				}
			}
		}
	}
    
    public void gnomeSort(int arr[], int n){
        int index = 0;
 
        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }
    
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
  
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    
    
}

