package SortAlgoPractice;
import java.util.Random;

public class MergeSortLeastToGreatestV2 {
    public static void main(String[] args) {
        Random randGen = new Random();
        int[] numbers = new int[85];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = randGen.nextInt(250) - 100;
        }

        mergeSort(numbers);

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }

    public static void mergeSort(int[] numbers ) {
        int numbersLength = numbers.length;

        if (numbersLength < 2) {
            return;
        }

        int midIndex = numbersLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[numbersLength - midIndex];

        for(int i = 0; i < midIndex; i++) {
            leftHalf[i] = numbers[i];
        }

        for(int i = midIndex; i < numbersLength; i++) {
            rightHalf[i - midIndex] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        sort(numbers, leftHalf, rightHalf);

    }

    public static void sort(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftSize && j < rightSize) {
            if(leftHalf[i] <= rightHalf[j]) {
                numbers[k] = leftHalf[i];
                i++;
            } else {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize) {
            numbers[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            numbers[k] = rightHalf[j];
            j++;
            k++;
        }

    }
    
}
