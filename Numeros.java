
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class Numeros {

    Random rand = new Random();
    private File Archivo = new File("datos.txt");

    public String crearNumero(){

        String ContenidoArchivo = " ";
       
        
        int cantidad = rand.nextInt(3000 - 10) + 10;
        for (int i = 0; i < cantidad; i++) {
            ContenidoArchivo += String.valueOf(rand.nextInt()) + " ";
        }
        return ContenidoArchivo;
    }


    

    public void guardarArchivo(String contenido) throws Exception{
        String ContenidoArchivo = contenido;
        System.out.println(Archivo.toString());
        FileWriter myWriter = new FileWriter(Archivo, false);
        myWriter.write(ContenidoArchivo);
        myWriter.close();
	
    }
    
    
    public int[] leerArchivo() throws FileNotFoundException{
        Scanner myReader = new Scanner("datos.txt");
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
