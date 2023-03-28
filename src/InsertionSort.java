import java.util.Arrays;
import java.util.Random;

public class Insertion {

    public static int insertionSort(int[] A) {
        //int[] arr = {5, 2, 4, 6, 1, 15};
        int cnt= 0;
        for (int i = 2; i <= A.length; i++) {
            cnt++;
            int key = A[i-1];
            cnt++;
            int j = i - 1;
            cnt+=1;
            while (j > 0 && A[j-1] > key) {
                cnt++;// cuento la entrade del while
                A[j + 1-1] = A[j-1];
                cnt++;
                j--;
                cnt++;
            }
            cnt++; //Salida del while
            A[j + 1-1] = key;
            cnt++; // Salida del for inicial

        }
        cnt++;
        return cnt;
    }
    public static int f_best(int n){
        return 5*n-4;
    }
    public static int f_worst(int n){
        return (int) (1.5 * Math.pow(n,2) + 3.5 * n - 4);
    }
    public static int f_average(int n){
        return (int) (0.75 * Math.pow(n,2) + 2.75 * n - 3.5);
    }

    public static int[] ordenado(int n) {
        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = i;
        }
        return lista;
    }

    public static int[] ordenadoInverso(int n){
        int[] lista= new int[n];
        for(int i = n; i > 0; i--){
            lista[n-i]= i;
        }
        return lista;
    }

    public static void Validacion(){
        int[] listaN= {100,200,300,500,800};
        for(int n: listaN){
            int[] arr_O = ordenado(n);
            System.out.println("Tamaño " + n);
            System.out.println("Mejor Caso: " + insertionSort(arr_O) +" "+ f_best(n));
            int[] arr_OI = ordenadoInverso(n);
            System.out.println("Peor Caso: " + insertionSort(arr_OI) + " " + f_worst(n));
            int average= 0;
            Random rand =new Random();
            for(int k= 0; k < 1000; k++){
                int[] arrAv = rand.ints(n, 0, 1000000).toArray();
                 int count = insertionSort(arrAv);
                average += count;
            }
            average /=100;
            System.out.println("Caso promedio: "+ average +" " + f_average(n));
            System.out.println("**************************************");
        }
    }
    public static void main(String[] args) {
        Validacion();;
    }
}
