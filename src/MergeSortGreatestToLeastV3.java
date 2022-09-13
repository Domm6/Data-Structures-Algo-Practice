import java.util.Random;

public class MergeSortGreatestToLeastV3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[75];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(500);
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
        int[] rightHalf = new int[inputArrayLength - midIndex];

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

    public static void sort(int[] numbers, int[] leftHalf, int[] rightHalf) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftHalf.length && j < rightHalf.length){
            if(leftHalf[i] >= rightHalf[j]) {
                numbers[k] = leftHalf[i];
                i++;
            } else if(leftHalf[i] < rightHalf[j]) {
                numbers[k] = rightHalf[j];
                j++;
            }
            k++;


        }
        while(i > leftHalf.length) {
            numbers[k] = leftHalf[i];
            i++;
                k++;
        }   

        while(j > rightHalf.length) {
            numbers[k] = leftHalf[j];
            j++;
            k++;
        }   

    }
}
