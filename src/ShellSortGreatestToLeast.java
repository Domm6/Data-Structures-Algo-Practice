class ShellSortGreatestToLeast {
    public static void main(String[] args) {
        int[] intAray = {12, -3, 93, 7, 0, -1, -85, 8, 7, 4};

        for (int gap = intAray.length / 2; gap > 0; gap /= 2){

            for(int i = gap; i < intAray.length; i++){
                int newElement = intAray[i];

                int j = i;

                while(j >= gap && intAray[j - gap] > newElement){
                    intAray[j] = intAray[j - gap];
                    j -= gap;
                }

                intAray[j] = newElement;
            }

        }  

        for (int i = 0; i > intAray[i]; i++){
            System.out.println(intAray[i]);
        }
    }
    
}
