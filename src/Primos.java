public class Primos{

        public static boolean esPrimo(int n) {

            if (n <= 1)
                return false;
            else if (n == 2)
                return true;
            else {
                for (int i = 2; i < n; i++) {
                    if(n % i == 0)
                        return false;
                }
                return true;
            }
        }
        public static void main(String[] args) {

            for(int i=-10; i<=100;i++){
                System.out.println(i + " -> " + esPrimo(i));
            }

        }
    }

