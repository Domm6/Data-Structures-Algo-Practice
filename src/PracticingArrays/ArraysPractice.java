package PracticingArrays;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String[] family = new String[5];
        family[0] = "Damien";
        family[1] = "Devan";
        family[2] = "Dominic";
        family[3] = "Louis";
        family[4] = "Patricia";

        System.out.println(Arrays.toString(family));

        int[] evenNumbers = {2,4,6,8};
        System.out.println(Arrays.toString(evenNumbers));
        for(int i = 0; i < evenNumbers.length; i++){
          System.out.println(evenNumbers[i]);
        }
        for(int number : evenNumbers){
          System.out.println(number);
        }

      /*  Array chores = new Array(3);
        chores.insert("clean dishes");
        chores.insert("do laundry");
        chores.insert("pick up dog poop");
        System.out.println(Arrays.toString(chores));

        Array phone = new Array(4);*/
        

        


    }

}
