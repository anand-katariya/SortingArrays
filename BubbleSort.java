public class BubbleSort{

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

    public static void Display(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,5,21,34,5,67,45};
        Bubble(arr);
        Display(arr);
        
    }
}