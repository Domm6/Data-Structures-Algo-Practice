public class SelectionSortLeastToGreatest {
    public static void main(String[] args) {
        int intArray[] = {12, -3, 93, 7, 0, -1, -85, 8, 7, 4};

        for(int lastUnosortedPartiton = intArray.length -1; lastUnosortedPartiton > 0; lastUnosortedPartiton--){
            int largest = 0;
            for(int i = 0; i <= lastUnosortedPartiton; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnosortedPartiton);
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
