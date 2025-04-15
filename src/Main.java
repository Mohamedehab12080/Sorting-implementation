import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     // creating an object from the class which implements interface of quick sort
        QuickSortInterface quick=new QuickSortImplement();
        int arr[]={9,4,8,3,2,1}; // Taking at the best case O(nlogn) and average case O(nlogn) and worst case O(n^2)
        quick.sort(arr,0,arr.length-1);
        System.out.println("sorted array : "+Arrays.toString(arr));
    }
}