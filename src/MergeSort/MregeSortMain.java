package MergeSort;

public class MregeSortMain {
    public static void main(String[] args) {
        MergeSortInteraface  mergesort=new MergeSortImplementation();
        int array[]={9,8,4,3,2,1};
        mergesort.sort(array,0,array.length-1);
        System.out.printf("Sorted array:%n");
        for (int a:array) {
            System.out.print(a+" ");
        }
    }
}
