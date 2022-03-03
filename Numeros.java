
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.Scanner;

public class Numeros {
    Random rand = new Random();
    private File Archivo = new File("datos.txr");
    
    /***
     * Se genera la ruta del archivo que se va a utilizar para guardar
     * los numeros a ordenar
     * 
     * @throws URISyntaxException
     */
    void generarRuta() throws URISyntaxException{
        String jarPath = Numeros.class
            .getProtectionDomain()
            .getCodeSource()
            .getLocation()
            .toURI()
            .getPath();
        
            Archivo = new File(jarPath.substring(0, 1) + "/datos.txt");
    }

    

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
        Scanner myReader = new Scanner(Archivo);
        int [] datos = null;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String [] datosPrograma = data.split(" ");
            datos = new int [datosPrograma.length];
            for (int i = 0; i < datosPrograma.length; i++) {
                    datos[i] = Integer.parseInt(datosPrograma[i]);
            }
        }
        return datos;
    }
    
    
}
