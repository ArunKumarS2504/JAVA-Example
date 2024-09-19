package Arrays;

public class reverse {

   public static void  reverse(int arr[]){
        int reversedArr[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            reversedArr[i]= arr[arr.length-i-1];
        }
        System.out.print("Reverserd array :");
        for(int i:reversedArr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        reverse(array);

    }
}
