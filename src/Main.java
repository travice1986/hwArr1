import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1, 2
        System.out.println("Task 1, 2");
        int[] intArr = new int[]{1, 2, 3};
        System.out.print("Целочисленный массив (new): ");
        for (int i = 0; i < 3; i++) {
            if (i == intArr.length - 1) System.out.print(intArr[i]);
            else System.out.print(intArr[i] + ", ");
        }
        System.out.println();
        System.out.print("Массив с дробными значениями: ");
        float[] floatArr = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < 3; i++) {
            if (i == intArr.length - 1) System.out.print(floatArr[i]);
            else System.out.print(floatArr[i] + ", ");
        }
        System.out.println();
        System.out.print("Мой массив с символами: ");
        char[] charArr = {'#', '$', '%'};
        for (int i = 0; i < 3; i++) {
            if (i == intArr.length - 1) System.out.print(charArr[i]);
            else System.out.print(charArr[i] + ", ");
        }
        //Task 3
        System.out.println();
        System.out.println("Task 3");
        System.out.println("Те же массивы, но выведенные в обратном порядке:");
        for (int i = 2; i >= 0; i--) {
            if (i == 0) System.out.print(intArr[i]);
            else System.out.print(intArr[i] + ", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            if (i == 0) System.out.print(floatArr[i]);
            else System.out.print(floatArr[i] + ", ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            if (i == 0) System.out.print(charArr[i]);
            else System.out.print(charArr[i] + ", ");
        }
        //Task 4
        System.out.println();
        System.out.println("Task 4");
        for (int i = 0; i < intArr.length; i++) if (intArr[i] % 2 != 0) intArr[i] += 1;
        System.out.print(Arrays.toString(intArr));
    }
}
