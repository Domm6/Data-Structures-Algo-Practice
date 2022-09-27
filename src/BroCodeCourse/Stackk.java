package BroCodeCourse;
import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        System.out.println("empty: " + stack.isEmpty());

        stack.push("Minecraft");
        stack.push("Rocket League");
        stack.push("Fortnite");
        stack.push("Borderlands");

        String myLeastFavGame = stack.pop();

        System.out.println("My least favorite game is: " + myLeastFavGame);
        System.out.println("The game at the top of the stack is: " + stack.peek());
        System.out.println("stack: " + stack);
        System.out.println("empty: " + stack.isEmpty());

        System.out.println("Rocket Leage is at postion: " +stack.search("Rocket League"));

        //stacks can run out of memory
        //if object not found in stack, will return -1



        
    }
}
