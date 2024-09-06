import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort {
    public static void main(String[] args) {

        int r[] = {12,121,212,132,34,56,32,1};
        Arrays.sort(r);
        for(int i = 0; i<r.length;i++){
            System.out.print(r[i]+" ");
        }
        //reverse order
        System.out.println();
        Integer arr[] = {1,5,2,7,3,9,3,4,542,232};
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        

    } 
    
}
