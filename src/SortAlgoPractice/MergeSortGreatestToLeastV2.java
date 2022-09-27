package SortAlgoPractice;
import java.util.Random;


public class MergeSortGreatestToLeastV2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }

        mergeSort(numbers);
        
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void mergeSort(int[] numbers) {
        int inputArrayLength = numbers.length;

        if(inputArrayLength < 2) {
            return;
        }

        int midIndex = inputArrayLength / 2; 
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int [inputArrayLength - midIndex];

        for(int i = 0; i < midIndex; i++) {
            leftHalf[i] = numbers[i];
        }

        for(int i = midIndex; i < inputArrayLength; i++) {
            rightHalf[i - midIndex] = numbers[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        sort(numbers, leftHalf, rightHalf);
    }

    public static void sort(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftSize && j < rightSize) {
            if(leftHalf[i] >= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i > leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j > rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }

}
