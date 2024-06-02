import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        double[] weights2 = {1.57, 7.654, 9.986};
        String[] array = {"One", "Two", "Three"};
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 2");
        for (int i = 0; i < weights.length; i++) {
            if (i != weights.length - 1) {
                System.out.print(weights[i] + ", ");
            } else {
                System.out.print(weights[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < weights2.length; i++) {
            if (i != weights2.length - 1) {
                System.out.print(weights2[i] + ", ");
            } else {
                System.out.print(weights2[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 3");
        for (int i = weights.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weights[i]);
            } else {
                System.out.print(weights[i] + ", ");
            }
        }
        System.out.println();

        for (int i = weights2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(weights2[i]);
            } else {
                System.out.print(weights2[i] + ", ");
            }
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Task 4");
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i]++;
            }
        }
        System.out.println(Arrays.toString(weights));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}