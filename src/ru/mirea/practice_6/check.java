package ru.mirea.practice_6;
import java.util.Arrays;

public class check {
    public static int[] insertsort(int[] sourceArray) {
        int[] destinationArray = new int[sourceArray.length];
        int destinationSize = 0;
        for (int n = 0; n < sourceArray.length; n++) {
            int insertIndex = 0;
            if (destinationSize > 0) {
                while (insertIndex < destinationSize && destinationArray[insertIndex] < sourceArray[n]) {
                    insertIndex++;
                }
            }
            for (int m = destinationSize - 1; m >= insertIndex; m--) {
                destinationArray[m + 1] = destinationArray[m];
            }
            destinationArray[insertIndex] = sourceArray[n];
            destinationSize++;
        }
        return destinationArray;
    }
    public static void main(String[] args) {
        int[] IDNumber = { 1, 18, 9, 10, 3, -3, 5 };
        int[] result = insertsort(IDNumber);
        System.out.println("Осортированный список (сортировкой вставками):");
        System.out.println(Arrays.toString(result));
    }
}
