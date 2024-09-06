import java.util.*;
public class Overall {

    // Bubble Sort Algorithm
    public static void Bubble(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1 ;i++ ){
            for(int j = 0; j < n - 1- i; j ++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp; 
                }
            }
        }
    }
    

    //Selection Sort Algorithm
    public static void Selection(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++){
                int min = i;
                if(arr[j] < arr[min]){
                    min = j;
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    //Inserting sort Algorithm
    public static void Inserting(int arr[]){
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev +1] = curr;
        }
    }


    // Inbuilt Sort of Java
    public static void Inbuilt(int arr[]){
        Arrays.sort(arr);
    }



    // Counting Sort Algorithm
    public static void Counting(int arr[]){
        int largest = Integer.MIN_VALUE;
        // Correct the Math.max usage to update the largest value
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]); // Updating largest with the result of Math.max
        }

        int[] count = new int[largest + 1];  // Allocate enough space for all elements

        // Fill the count array with frequencies
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        // Sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


}
