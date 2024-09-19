package TRAINING;

public class secondLarrgest {

    public static Integer findSecondLargest(int[] arr){
        if(arr.length<2){
            return null;
        }
        int first = Integer.MIN_VALUE;

        int sec  = Integer.MIN_VALUE;



        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                first = arr[i];

            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > sec && arr[i] < first) {
                sec = arr[i];
            }
        }

        return (sec == Integer.MIN_VALUE) ? null : sec;

    }
    public static void main(String[] args) {
        int[]  arr = {10,3,4,52,32};
        Integer secondLargest = findSecondLargest(arr);
        if (secondLargest != null) {
            System.out.println("The second largest number is: " + secondLargest);
        } else {
            System.out.println("The array doesn't have a second largest number.");
        }
    
    }
}
