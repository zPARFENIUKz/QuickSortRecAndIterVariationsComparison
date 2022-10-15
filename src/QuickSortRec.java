public class QuickSortRec extends Partition{
    public static void quickSort(final int[] arr){
        if (arr == null) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(final int[] arr, final int lowIndex, final int highIndex){
        if (lowIndex < highIndex){
            final int[] pivotInterval = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, pivotInterval[0] - 1);
            quickSort(arr, pivotInterval[1] + 1, highIndex);
        }
    }
}
