public class SelectionSort {
    public static void Selection(int arr[]){
        int n = arr.length;
        for (int i = 0 ; i<n-1;i++){
            int min_indx = i;
            for(int j = i+1; j<n; j++ ){
                if(arr[j]< arr[min_indx]){
                    min_indx = j;
                    int temp = arr[min_indx];
                    arr[min_indx] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }
    public static void Display(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,32,34,22,2,67,45,29,43};
        Selection(arr);
        Display(arr);
    }
}
