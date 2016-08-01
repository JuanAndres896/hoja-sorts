/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 01 de agosto del 2016
 * Descripción: Esta clase implementa el contrato de la interfaz "Comparable" lo cual servira para el sorting. Esta clase se encarga de dar
 * una lista de 3000 enteros aleatorios.
 */

import java.util.Random;
import java.io.*;

public class Estructura implements Comparable{
    
    /**
     * atributo lista es un arreglo de enteris para almencenar los 3000 numeros aleatorios
     */
    protected int[]  lista;

    /**
     * Constructor de la clase, aqui mismo se crea la lista con los 3000 numeros enteros aleatorios y se guarda en un archivo.txt
     * @throws IOException
     */
    public Estructura()throws IOException{
        Random  rnd = new Random();
        lista = new int[3000];
        for(int i = 0; i<lista.length; i++){
            lista[i] = (int) (rnd.nextDouble() * 100000.0 + 0.0);
        }
        String ruta = "C:/Users/Christian Morales/Desktop/UVG/4 CUARTO SEMESTRE/Algoritmos y Estructura de Datos/LABS/HDT 3 Sorts/archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        for(int i = 0; i<lista.length; i++){
            bw.write(lista[i]+ "\n");
        }
    }
    
    public void setLista(int[] lista){
        this.lista = lista;
    }
    
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
}
