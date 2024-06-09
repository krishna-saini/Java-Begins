import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!"+"\n");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i); // print in next line
//        }

        int i = 5;
//        int j; always initiate a varible before accessing
        System.out.println("krishna i"+ i );

        /**
         * Strings are immutable
         * Strings are ref type DS
         * memory need to be allocated at the time of creation
         */
        String name = new String("krishna");
        String myName = "krishna";

        /**
         * Arrays are ref type DS
         */
        // old way
        int[] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 3;

        System.out.println("krishna array"+ Arrays.toString(numbers) );

        // new wat
//        int[] numbers1 = [1,2,3,4,5];  not working
        int[] numbers1 = {1,'2',3,4,5};
        System.out.println("krishna new array length "+Arrays.toString(numbers1));

        // multi-D array
        int[][] metrics = new int[2][3];
        metrics[0][2] = 5;
        System.out.println("metric " + Arrays.deepToString(metrics));

        int[][] metrics2 = { {1,2,3}, {4,5,6}};
        System.out.println("metric new way "+ Arrays.deepToString((metrics2)));

        // Constants
        final float PI = 1.14F;
        pi = 1;



    }
}