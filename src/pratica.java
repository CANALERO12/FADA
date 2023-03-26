public class pratica {



    public static void main(String[] args) {
        int[] arr={1,2,4,20,3,9,40};
        int max= arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] > max){
                max=arr[i];

            }
        }
        System.out.println("El numero mas grande es : " + max);
    }
}
