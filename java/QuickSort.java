import java.util.*;
public static void QuickSort(int arr[],int low,int high){
    if (low < high){
        int pi=partition (arr,low,high);
        QuickSort(arr,low,pi-1);
        QuickSort(arr,pi+1,high)

    }
}