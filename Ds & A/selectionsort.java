public class selectionsort {

    /*
     * 
     * selection sort is the sorting method but diffrent from bubble sort here 
     * 
     * first we assume  ith number the most smallest then we cheq whole list if ant number is smallest if does we replace i index to smallest after whole 
     * second loop we had most smallest index and after loop end we replace the number putting most smallest to ith position 
     */
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8,1};
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            for(int j=i ;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            int temp =arr[small];
            arr[small] = arr[i];
            arr[i] =temp;

        }
        for(int k : arr){
            System.out.println(k);
        }
    }
}
