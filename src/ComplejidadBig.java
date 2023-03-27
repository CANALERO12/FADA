public class ComplejidadBig{

    //este metodo busca un Número X en un arreglo de enteros, recorriendo
    //desde la posicion 0 hasta el final en busca de este retornando una variable
    //Booleana
    public static boolean Busqueda_lineal(int[] arr, int x){
        for(int i=0; i< arr.length; i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }
    /*
    En el  for  se entra n veces por lo tanto es un O(n)
    */

    //Este metodo lo que hace es saber si la suma de 2 numeros enteros
    //de un arreglo de enteros es igual al numero que le ingresamos
    public static boolean Busqueda(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { //1+2+3+4+....+n-1
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
    /*
    EL for mas interno se entra (n^2-n)/2 por lo tanto es un O(n^2)
    */


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0,2,4,5,65,6,7,56,3,25};
        int x=15;
        boolean encontrado = Busqueda_lineal(arr, x);
        System.out.println(encontrado);
        boolean resultado = Busqueda(arr, x);
        System.out.println(resultado);


    }
}