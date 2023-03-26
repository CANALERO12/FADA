import java.lang.Math;
public class Taller1 {

    public static double programa(long n){
        long s=0;
        for(long i=2*n; i>=0; i--){
            for(long j=i; j>=0; j--){
                s++;
            }
        }
        return s;
    }

    public static double programa1(long n){

        return (2*n+1)*(n+1);
    }

    public static double programa2(long n){
        long t=0;
        for(long i=0; i<=n*n; i+=2){
            for(long j=1; j<=i; j++){
                t++;
            }
        }
        return t;
    }

    public static double problema2_1(long n){
        double valor1 = Math.pow(n,4);
        double valor2 = Math.pow(n,2);
        return (valor1+(2*valor2))/4;
    }
    public static void main(String[] args) {
        long[] arr = {2, 4,6,8,10,20,40};
        for(long valor:arr) {
            System.out.println(valor + " " + programa(valor) + " " +
                    programa1(valor));
        }
        System.out.println("***************************************problemas ****************************");
        for(long valor:arr){
            System.out.println(valor+" "+programa2(valor) + " " +
                    problema2_1(valor));

        }
    }
}
