/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 01 de agosto del 2016
 * Descripción: Esta clase hara uso de la clase Estructura para generar un archivo.txt con una lista de 3000 enteros aleatorios y usara
 * la clase Sorts para ordenar dicha lista por distintos metodos
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    
    //Metodo para leer un archivo .TXT
    public static String muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        b.close();
        return cadena;
    }
    
    public static void main(String[] args) throws IOException{
        
//        FileReader entrada=null;
//        StringBuilder str=new StringBuilder();
//        int[] lista = new int[3000]; 
//        int n=0;
//        
//        BufferedReader fileIn = new BufferedReader(
//        new FileReader ("C:/Users/Christian Morales/Desktop/UVG/4 CUARTO SEMESTRE/Algoritmos y Estructura de Datos/LABS/HDT 3 Sorts/archivo.txt"));
//        int read = fileIn.read();
//        
//        while (read != -1){
//            while((char)read!='\n'){
//                lista[n]=read;
//                n++; 
//                read = fileIn.read();
//            }
//                read = fileIn.read();
//        }
//        System.out.println(Arrays.toString(lista));
//        
        Estructura data = new Estructura();
        //data.setLista(lista);
        Sorts sort = new Sorts();
        
        /* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         - - - - - - - - -  G N O M E - S O R T - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -    */
        int[] lista1 = sort.GnomeSort(data);
        System.out.println("Con GnomeSort");
        System.out.println(Arrays.toString(lista1));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  ");
        
        /* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         - - - - - - - - -  M E R G E - S O R T - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -    */
        int[] lista2 = sort.MergeSort(data.lista);
       System.out.println("Con MergeSort");
        System.out.println(Arrays.toString(lista2));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  ");
       
        /* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         - - - - - - - - -  Q U I C K - S O R T - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -    */
        int[] lista3 = sort.QuickSort(data.lista,0,100);
        System.out.println("Con QuickSort");
        System.out.println(Arrays.toString(lista3));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  ");
        
        /* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         - - - - - - - - -  R A D I X - S O R T - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
         - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -    */
        int[] lista4 = sort.RadixSort(data);
        System.out.println("Con RadixSort");
        System.out.println(Arrays.toString(lista4));
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  ");
    }
    
}
