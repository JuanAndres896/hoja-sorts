
import java.io.IOException;

/**
 * Universidad del Valle de Guatemala
 * @author Christian Morales, Jose Luis Méndez, Juan García
 * Carne: 15015, 15021, 15046
 * 01 de agosto del 2016
 * Descripción: Esta clase se ocupará de tener los distintos sorts con los que se trabajara, va a ordenar la lista de numeros aleatorios
 */

public class Sorts {
    
    public Sorts(){ }
    
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


    /***************************************************************************************
    *                   Algoritmo Quicksort
    * Version recursiva, modificado de: http://www.algolist.net/Algorithms/Sorting/Quicksort
     * @param lista
     * @param izq
     * @param der
     * @return 
    ****************************************************************************************/
    public int[] QuickSort(int[] lista, int izq, int der){
        int indice = Particion(lista, izq, der);
        /* Ordenar recursivamente */
        if (izq < indice-1)
            QuickSort(lista, izq, indice-1);

       if(indice < der)
            QuickSort(lista, indice, der);
       return lista;
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

    /**
     *
     * @param lista un arreglo de ints aleatorios
     * @return lista int[] ya ordenada
     */
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
    *                 Algoritmo GnomeSort
    ********************************************************************/
    
    /**
     * @param datos un objeto tipo Estructura que implementa CompareTo
     * @return lista int[] ya ordenada
     */
    public int[] GnomeSort(Estructura datos){
        int[] lista = datos.lista;
        int i=1;
        int j=2;
         while(i < lista.length) {
            if ( lista[i-1] <= lista[i] ) {
                i = j; j++;
            } else {
                int tmp = lista[i-1];
                lista[i-1] = lista[i];
                lista[i--] = tmp;
                i = (i==0) ? j++ : i;
            }
        }
        return lista;
    }
    /*
     /********************************************************************
    *                   Algoritmo RadixSort
    ********************************************************************/
    public int[] RadixSort(Estructura datos){
        int[] lista = datos.lista;
        int i, m = lista[0], exp = 1, n = lista.length;
        int[] b = new int[lista.length];
        for (i = 1; i < n; i++)
            if (lista[i] > m)
                m = lista[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[lista.length];
 
            for (i = 0; i < n; i++)
                bucket[(lista[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(lista[i] / exp) % 10]] = lista[i];
            for (i = 0; i < n; i++)
                lista[i] = b[i];
            exp *= 10;        
        }
        return lista;
    }
    
    
}
