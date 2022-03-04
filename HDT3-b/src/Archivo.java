/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Angel
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.net.URISyntaxException;
import java.util.Scanner;


public class Archivo {
    private File archivoFisico = new File("numeros.txr");
    
    /***
     * genera una ruta para guardar el archivo
     * 
     * @throws URISyntaxException
     */
    private void generarRuta() throws URISyntaxException{
        String jarPath = Archivo.class 
            .getProtectionDomain()
            .getCodeSource()
            .getLocation()
            .toURI()
            .getPath();
        
        archivoFisico = new File(jarPath.substring(0, 1) + "/numeros.txt");
    }
    
    /***
     * guerda la cadena en un txt
     * 
     * @author javier
     * @param contenido Cadena de texto con los numeros generados aleatoriamente
     * @throws Exception
     */
    public void guardarArchivo(String contenido) throws Exception{
        String fileContent = contenido;
        System.out.println(archivoFisico.toString());
        FileWriter myWriter = new FileWriter(archivoFisico, false);
        myWriter.write(fileContent);
        myWriter.close();
	
    }
    
    /***
     * lee el archivo txt
     * 
     * @author javier
     * @return 
     * @throws FileNotFoundException
     */
    public int[] leerArchivo() throws FileNotFoundException{
        Scanner myReader = new Scanner(archivoFisico);
        int [] arr = null;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String [] datosPrograma = data.split(" ");
            arr = new int [datosPrograma.length];
            for (int i = 0; i < datosPrograma.length; i++) {
                    arr[i] = Integer.parseInt(datosPrograma[i]);
            }
        }
        return arr;
    } 
}