package MergeSort;

public class MergeSortImplementation implements MergeSortInteraface {

    @Override
    public void sort(int[] array, int start, int end) {
        if (start < end) {
            // calculate the middle index to divide the array into two halves
            int middle = (start + end) / 2;

            // recursive call for the left half
            sort(array, start, middle);

            // recursive call for the right half
            sort(array, middle + 1, end);

            // merge the two sorted halves
            merge(array, start, middle, end);
        } else {
            // base case where the array has one or no elements
            System.out.println("Start is greater than or equal to end");
        }
    }

    @Override
    public void merge(int[] array, int start, int middle, int end) {
        // sizes of the two subarrays to merge
        int size1 = middle - start + 1;
        int size2 = end - middle;

        // create temporary arrays
        int[] left = new int[size1];
        int[] right = new int[size2];

        // copy data to temporary arrays
        for (int i = 0; i < size1; i++) {
            left[i] = array[start + i];
        }

        for (int j = 0; j < size2; j++) {
            right[j] = array[middle + 1 + j];
        }

        // initial indexes of first and second subarrays
        int i = 0, j = 0;

        // initial index of merged subarray
        int k = start;

        // merge the temp arrays back into the original array
        while (i < size1 && j < size2) {
            // compare and put the smaller element in the merged array
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of left[] if any
        while (i < size1) {
            array[k] = left[i];
            i++;
            k++;
        }

        // copy remaining elements of right[] if any
        while (j < size2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}

