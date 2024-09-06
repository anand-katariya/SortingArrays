public class CountingSort {
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

    public static void Display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 4, 6, 2, 3, 8, 7, 4, 6, 1};
        Counting(arr);
        Display(arr);
    }
}

