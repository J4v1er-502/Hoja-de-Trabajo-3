public class BubbleSort{

    public int[] ordenar(int[] arreglo) {

        int n = arreglo.length;  
        int temp = 0; 

        for(int i=0; i < n; i++){  

            for(int j=1; j < (n-i); j++){  

                if(arreglo[j-1] > arreglo[j]){

                    temp = arreglo[j-1];  
                    arreglo[j-1] = arreglo[j];  
                    arreglo[j] = temp;  

                }             
            }  
        } 

        return arreglo; 
        
    }
}