/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Angel
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angel
 */
public class Main {
    
    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Archivo archivo = new Archivo();
        
        Random random = new Random();
        
        Scanner sc = new Scanner(System.in);
        
        Sort sort= new Sort(new ComparateAsc());
        
        String fileContent = "";
        
        int option=0;
        int[] a = null;
        
        boolean Salir = false;
        
        //int qty = random.nextInt(3000 - 10) + 10; // Genera la cantidad de numeros a escribir en el archivo
        int qty = 3000;
        for (int i = 0; i < qty; i++) {
            fileContent += String.valueOf(random.nextInt(3000 - 0) + 0) + " ";
        }
        try {
            archivo.guardarArchivo(fileContent); // guardamos el arvhivo en la raiz
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error al guardar el archivo");
        }
        
        try {
            a = archivo.leerArchivo();

        } catch (FileNotFoundException ex) {
            System.out.println("No se ha podido leer el arhivo");
        }
        while (Salir == false) {
            System.out.println("Bienvenido al programa de ordenamiento");
            System.out.println("ingrese: \n1 Gnome \n2 Merge \n3 Quick \n4 Radix \n5 Buble \n --Cualquier otro para salir");
            int desicion = sc.nextInt();

            if(desicion == 1){
                System.out.println("\n---------------------");
                System.out.println("\n---------------------");
                System.out.println("\nUtilizando Gnome sort");

                sort.gnomeSort(a, a.length);
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
                try {
                    Thread.sleep(2050);

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            else if(desicion == 2){
                System.out.println("\n---------------------");
                System.out.println("\n---------------------");
                System.out.println("\nUtilizando Merge sort");
                sort.sort(a, 0, a.length - 1);
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
                try {
                    Thread.sleep(2050);

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            else if(desicion == 3){
                sc.nextLine();
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

                try {
                    Thread.sleep(2050);

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            

            else if(desicion == 4){
                System.out.println("\n---------------------");
                System.out.println("\n---------------------");

                System.out.println("\nUtilizando el algoritmo Radix sort");
                sort.radixSort(a);
//                for (int i=0; i< a.length; i++) {
//                    System.out.println(a[i]);
//                }

                try {
                    Thread.sleep(2050);

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }

            else if (desicion == 5){
                System.out.println("\n---------------------");
                System.out.println("\n---------------------");

                System.out.println("\nUtilizando el algoritmo Bubble sort");

                sort.BubbleSort(a);

                for (int i=0; i< a.length; i++) {
                    System.out.println(a[i]);
                }
                try {
                    Thread.sleep(2050);

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            else 
            Salir = true;

        }
    }
}
