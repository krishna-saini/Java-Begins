import java.util.Arrays;
import java.util.Scanner;

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
        int[][] metric = new int[2][3];
        metric[0][2] = 5;
        System.out.println("metric " + Arrays.deepToString(metric));

        int[][] newMetrics = { {1,2,3}, {4,5,6}};
        System.out.println("metric new way "+ Arrays.deepToString((newMetrics)));

        // Constants
        final float PI = 1.14F;
//        pi = 1;  not allowed

        // Casting

        // implicit casting
        // byte > short > int > long > float > double
        byte x = 1;
        int y = x + 2;  // it will first create a anonymous variable of int type which will take value of x and then will add

        //
        double a = 1.1;
        double b = a + 2;  // Java will cast 2 to 2.0 was int has lowe priority ove float
        System.out.println(" double b = " + b);

        // explicit cast
        double a1 = 1.1;
        int b1 = (int)a1 +2; // 3
        System.out.println("explicit b1 = "+b1);

        // take input from user - Scanner package
        Scanner scanner = new Scanner(System.in); // input from terminal
//        System.out.print("age:");
        // the scanner object has bunch of methods to read data and all of these methods
        // start with next
//        byte age = scanner.nextByte();
//        System.out.println("your age is - " + age);

        System.out.print("name: "); // input given - Krishna Saini
//        String yourName = scanner.next();  // output - krishna
        String yourName = scanner.nextLine();  // o/p Krishna Saini
        System.out.println("your name is - " + yourName);


    }
}