public class SelectionSortGreatestToLeast {
    public static void main(String[] args) {
        int[] intArray = {12, -3, 93, 7, 0, -1, -85, 8, 7, 4};

        for(int lastUnsortedPartition = intArray.length - 1; lastUnsortedPartition > 0; lastUnsortedPartition--){
            int smallest = 0;

            for(int i = 0; i <= lastUnsortedPartition; i++){
                if(intArray[i] < intArray[smallest]){
                    smallest = i;
                }
            }

            swap(intArray, smallest, lastUnsortedPartition);
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
    }
    
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
