package SortAlgoPractice;

class BubbleSortGreatestToLeast {
    public static void main(String[] args) {
        int[] intArray = {4, 83, -4, 1, -38, 39, -94, -2, 0};

        for(int lastUnsortedPartion = intArray.length - 1; lastUnsortedPartion > 0; lastUnsortedPartion--){
            for(int i = 0; i < lastUnsortedPartion; i++){
                if(intArray[i] < intArray[i +1]){
                    swap(intArray, i, i + 1);
                }
            }
        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        
    }

    public static void swap(int[] array, int i, int j){
        if(array[i] == array[j]){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
    
}
