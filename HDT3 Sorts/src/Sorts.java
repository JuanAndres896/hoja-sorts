
import java.io.IOException;

/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 25 de Julio del 2016
 * Descripción: Esta clase se ocupará de tener los distintos sorts con los que se trabajara, va a ordenar la lista de numeros aleatorios
 */

public class Sorts {
    
   protected Estructura datos;
   
    public Sorts(){
        
    }

    /***************************************************************
    *                     Particiones para Quicksort
    * Devuelve el indice que va a entrar al ordenamiento
    ****************************************************************/
    public int Particion(int[] lista,int izq, int der){
        // Punteros para recorrer la lista
        int i= izq;
        int j = der;
        int temp;
        int pivote = lista[(izq + der)/2];

        while(i <= j){
            /*Recorrer punteros izquierdo y derecho*/
            while(lista[i]<pivote)
                i++;
            while(lista[j]>pivote)
                j--;
            if(i<=j){
                temp = lista[i];
                lista[i] = lista[j]; // Intercambio de punteros
                lista[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }


    /********************************************************************
    *                   Algoritmo Quicksort
    ********************************************************************/
    public void QuickSort(int[] lista, int izq, int der){
        int indice = Particion(lista, izq, der);
        /* Ordenar recursivamente */
        if (izq < indice-1)
            QuickSort(lista, izq, indice-1);

       if(indice < der)
            QuickSort(lista, indice, der);
    }
     /******************************************************************************************************
    *                  Algoritmo Mergesort
    * Codigo modificado de: http://javahungry.blogspot.com/2013/06/java-sorting-program-code-merge-sort.html
    ********************************************************************************************************/
    public void Merge(int[] primer, int[] segundo, int[] resultado){
      // Juntar las mitades en el arreglo resultante
      // Elemento siguiente a tomar en el primer array
      int itera1 =0;
      // Elemento siguiente a tomar en el segundo array
      int itera2 =0;  
      // Siguiente posicion abierta en el resultante
      int j =0;
      // Mientras los iteradores no esten al final del arreglo, mover el mas pequeno al resultante
      while(itera1 < primer.length && itera2 < segundo.length){

        if(primer[itera1] < segundo[itera2]){

            resultado[j] = primer[itera1];
            itera1++;
        }
        else{
            resultado[j] = segundo[itera2];
            itera2++;
        }
        j++;
      }
      // Copiar
      System.arraycopy(primer, itera1, resultado, j, primer.length -itera1);
      System.arraycopy(segundo, itera2, resultado, j, segundo.length -itera2); 
    }
    public int[] MergeSort(int[] lista){
        // Caso base, la lista tiene un elemento
        if(lista.length<=1){
            return lista;
        }
        // Partir array a la mitad
        int[] primer = new int[lista.length/2];
        int[] segundo = new int[lista.length-primer.length];
        System.arraycopy(lista,0,primer,0,primer.length);
        System.arraycopy(lista,primer.length,segundo,0,segundo.length);

        // Ordenar cada mitad
        MergeSort(primer);
        MergeSort(segundo);

        // Juntar las mitades en el arreglo original
        Merge(primer, segundo,lista);
        return lista;
    }
     /********************************************************************
    }
    *                 Algoritmo Gnomesort
    ********************************************************************/
    /*
    public int[] GnomeSort(int[] lista){
        
        return 
    }
     /********************************************************************
    *                   Algoritmo RadixSort
    ********************************************************************/
    /*public int[] RadixSort(int[] lista){
        
        return 
    }*/
    
    
}
