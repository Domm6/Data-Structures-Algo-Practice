import java.util.Random;

public class MergeSortLeastToGreatest{
    public static void main(String[] args) {
        //int[] inputArray = {12, -3, 93, 7, 0, -1, -85, 8, 7, 4};

        Random random = new Random();
        int[] inputArray= new int[175];
        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = random.nextInt(500);
        }

        mergeSort(inputArray);

        for(int i = 0; i < inputArray.length; i++ ){
            System.out.println(inputArray[i]);
        }
        
    }

    public static void mergeSort(int[] inputArray) {
        int inputArrayLength = inputArray.length;

        if(inputArrayLength < 2) {
            return;
        }

        int midIndex = inputArrayLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputArrayLength - midIndex];

        for(int i = 0; i < midIndex; i++){
            leftHalf[i] = inputArray[i];
        }

        for(int i = midIndex; i < inputArrayLength; i ++){
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        sort(inputArray, leftHalf, rightHalf);
    }

    public static void sort(int[] inputArray, int[] leftHalf, int[] rightHalf) {
          int leftSize = leftHalf.length;
          int rightSize = rightHalf.length;

          int i = 0;
          int j = 0;
          int k = 0;

          while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            } else if(leftHalf[i] > rightHalf[j]){
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;


          }

            while(i < leftSize){
                inputArray[k] = leftHalf[i];
                i++;
                k++;
            }

            while(j < rightSize){
                inputArray[k] = rightHalf[j];
                j++;
                k++;
            }

    }


}