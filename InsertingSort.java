public class InsertingSort {
    public static void Inserting(int arr[]){
        for(int i = 1 ; i < arr.length ; i++){
            int curr =arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev +1] = arr[prev];
                prev--;
            }
            arr[prev +1] = curr;
        }
    }
    public static void Display(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {23,34,452,232,234,4345,23,22,2,89};
        Inserting(arr);
        Display(arr);
    }
        
}

