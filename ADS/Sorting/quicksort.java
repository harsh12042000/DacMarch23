import java.util.Arrays;

public class quicksort {


    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low -1;
        
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
            i++;
            //swap
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        System.out.println(Arrays.toString(arr));

        return i; //pivot index]

    }

  static void sort(int arr[], int low, int high){
    if(low<high){
        int pivotindex = partition(arr, low, high);

        sort(arr, low, pivotindex-1);
        sort(arr, pivotindex+1, high);
    }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3};
        int n = arr.length;

        sort(arr, 0, n-1);

        //print
        for(int i=0; i<n; i++){

        System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}