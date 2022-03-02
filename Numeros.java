
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Numeros {
    private File Archivo = new File("datos.txr");
    
    

    public void guardarArchivo(String contenido) throws Exception{
        String fileContent = contenido;
        System.out.println(Archivo.toString());
        FileWriter myWriter = new FileWriter(Archivo, false);
        myWriter.write(fileContent);
        myWriter.close();
	
    }
    
    
    public int[] leerArchivo() throws FileNotFoundException{
        Scanner myReader = new Scanner(Archivo);
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
