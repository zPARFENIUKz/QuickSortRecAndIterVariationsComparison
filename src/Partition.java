public class Partition {
    protected static int[] partition(final int[] arr, final int lowIndex, final int highIndex){
        final int pivotIndex = generatePivotIndex(lowIndex, highIndex);
        final int pivot = arr[pivotIndex];
        if (pivotIndex != lowIndex){
            swap(arr, pivotIndex, lowIndex);
        }
        int leftPtr = lowIndex, rightPtr = highIndex;
        for (int i = leftPtr + 1; i <= rightPtr; ++i){
            if (arr[i] < pivot){
                swap(arr, i, leftPtr);
                ++leftPtr;
            } else if (arr[i] > pivot){
                swap(arr, i, rightPtr);
                --rightPtr;
                --i;
            }
        }
        return new int[] {leftPtr, rightPtr};
    }

    private static int generatePivotIndex(final int from, final int to){
        return (int)(from + Math.random() * (to - from));
    }

    private static void swap(final int[] arr, final int index1, final int index2){
        final int buf = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = buf;
    }
}
