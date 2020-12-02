package demos;

import java.util.ArrayList;

public class Sort {
    public void selectionSort(int[] toSort) {
        int index = 0;
        while (index < toSort.length-1) {
            if (toSort[index] > getMin(toSort)) {
                toSort[index] = getMin(toSort);
            }
        }
    }
    public Integer getMin(int[] remaining) {
        int min = 99999999;
        for (int temp : remaining) {
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
}
