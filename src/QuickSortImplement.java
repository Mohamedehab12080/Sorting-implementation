public class QuickSortImplement implements QuickSortInterface{


    @Override
    public void sort(int[] array, int start, int end) {
        if(start<end){
            int pivot=partition(array, start, end);
            sort(array, start, pivot-1); // for the left sub array;
            sort(array, pivot+1, end); // for the right sub array;
        }
    }

    @Override
    public void swap(int[] array, int first, int second) {
        int temp=array[first];
        array[first]=array[second];
        array[second]=temp;
    }

    @Override
    public int partition(int[] array, int start, int end) {
      int pivot=array[start];// pivot value and its index before partitioning is start
      int left=start+1;// left index
      int right=end; // right index
    while(true){

        while(left<=right&&array[left]<pivot){
            left++;
        }
        while(left<=right&& array[right]>=pivot){
            right--;
        }
        if(left>=right){
            break;
        }
        // this swap is done after know that one of the left or right are not in the true position
        swap(array,left,right);
        left++;
        right--;
    }
    // swap between the pivot at the start and the right
    swap(array,start,right);
        return right; // the new index of the pivot number be right
    }
}
