import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        final int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; ++i){
            arr[i] = (int) (Math.random() * arr.length / 2);
        }
        final int[] arrClone = arr.clone();
        Arrays.sort(arrClone);
        final long startTime = System.currentTimeMillis();
        QuickSortRec.quickSort(arr);
        final long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + "ms");
        System.out.println(Arrays.equals(arr, arrClone));
    }
}
