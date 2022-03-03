import java.net.URISyntaxException;
import java.util.Scanner;




public class Menu {

    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        Sort sort = new Sort(new Comparador());
        Scanner sc = new Scanner(System.in);

        boolean Salir = false;
        int[] a = null;

        try {
            numeros.guardarArchivo(numeros.crearNumero()); // guardamos el arvhivo en la raiz
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error al guardar el archivo");
        }
        try {
            numeros.generarRuta();
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            a = numeros.leerArchivo();
    
        } 
        catch (Exception ex) {
            System.out.println("No se ha podido leer el arhivo");
        }

        while (Salir = false) {

            System.out.println("Bienvenido al programa de ordenamiento");
            System.out.println("\nUtilizando Gnome sort");
            sort.gnomeSort(a, a.length);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

            System.out.println("\n---------------------");
            System.out.println("\n---------------------");
            System.out.println("\nUtilizando Merge sort");
            sort.sort(a, 0, a.length - 1);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

            System.out.println("\n---------------------");
            System.out.println("\n---------------------");
            System.out.println("\nUtilizando Quick sort");
            int inf,sup;
            
            System.out.println("Ingrese limite inferior");
            inf=Integer.parseInt(sc.nextLine());
            System.out.println("Ingrese limite superior");
            sup=Integer.parseInt(sc.nextLine());
            
            sort.quickSort(a, inf, sup);
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

            System.out.println("\n---------------------");
            System.out.println("\n---------------------");

            System.out.println("\nUtilizando el algoritmo Radix sort");
            sort.radixSort(a);

            System.out.println("\n---------------------");
            System.out.println("\n---------------------");

            System.out.println("\nUtilizando el algoritmo Bubble sort");

            sort.BubbleSort(a);

            for (int i=0; i< a.length; i++) {
                System.out.println("\n" + a[i]);
            }

            System.out.println("\n---------------------");
            System.out.println("\n---------------------");
        }
        

        
    }
}
