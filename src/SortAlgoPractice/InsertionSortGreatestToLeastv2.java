package SortAlgoPractice;
public class InsertionSortGreatestToLeastv2 {
    public static void main(String[] args) {
        int[] intArray = {12, -3, 93, 7, 0, -1, -85, 8, 7, 4};
        for(int firstUnsortedPartition = 1; firstUnsortedPartition < intArray.length; firstUnsortedPartition++){
            int newElement = intArray[firstUnsortedPartition];

            int i;

            for(i = firstUnsortedPartition; i > 0 && intArray[i - 1] < newElement; i-- ){
                intArray[i] = intArray [i - 1];
            }

            intArray[i] = newElement;


        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }        
    }
}