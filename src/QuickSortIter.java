import java.util.Stack;

public class QuickSortIter extends Partition{
    public static void quickSort(final int[] arr){
        if (arr == null) return;
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(final int[] arr, final int lowIndex, final int highIndex){
        final Stack<Integer> stack = new Stack<>();
        stack.push(highIndex);
        stack.push(lowIndex);
        while(!stack.isEmpty()){
            final int startIndex = stack.pop();
            final int endIndex = stack.pop();
            if (startIndex < endIndex){
                final int[] pivotInterval = partition(arr, startIndex, endIndex);
                // Now we need to push into the stack new intervals
                // 1st: [lowIndex, pivotInterval[0] - 1]
                // 2nd: [pivotInterval[1] + 1, highIndex]
                // As we're using the Stack DS, we need to push this in rev order:
                // First we need to push 2nd interval
                // Second we need to push 1st interval

                // 2nd
                stack.push(endIndex);
                stack.push(pivotInterval[1] + 1);

                // 1st
                stack.push(pivotInterval[0] - 1);
                stack.push(startIndex);
            }
        }
    }
}
