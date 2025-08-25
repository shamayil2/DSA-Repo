package August24_HW;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 11, 27, 4, 5, 1, -12, 134, 38 };

        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int si, int ei) {

        if(si>ei){
            return;
        }

        int pivot = partition(arr, si, ei);
        quickSort(arr, si, pivot - 1);
        quickSort(arr, pivot + 1, ei);

    }

    public static int partition(int[] arr, int si, int ei) {

        int idx = si;
        int temp = arr[ei];
        for (int i = si; i < ei; i++) {

            if (arr[i] < temp) {
                int j = arr[idx];
                arr[idx] = arr[i];
                arr[i] = j;
                idx++;
            }

        }

        int j = arr[idx];
        arr[idx] = arr[ei];
        arr[ei] = j;

        return idx;
    }

}
