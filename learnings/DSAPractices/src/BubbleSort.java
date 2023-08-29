import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* for each iteration in bubble sort the greatest number is moved to the end of the array
* So, the greatest number is in the position that it should be
* so we dont have to compare it again once we reached a number which is already is in its correct postion
* and that is equal to value of current iteration.
*
*/

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { -2, 45, 0, 11, -9 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) { //the imp of condition is explained above
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
