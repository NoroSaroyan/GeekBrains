package GeekBrains;

public class Main {

    public static void main(String[] args) {
   /*
        System.out.println("\r\n4 - задание");
        int[][] arr4 = new int[7][7];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }
        System.out.println();
        System.out.println();
        Print(arr4);
    */
        int[] arr = new int[]{0, 0, 0, 1, 1};
        int[] array = ChangeArray(arr);
        Print(array);
        System.out.println();

        array = InitializeArray(8);
        Print(array);
        System.out.println();

        arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        array = ChangeArr(arr);
        Print(array);
        System.out.println();

        int[][] arr2d = new int[7][7];
        int[][] arr_2d = TwoDimentionalArr(arr2d);
        Print(arr_2d);
        System.out.println();

        int[] arr1 = new int[]{12, 32, 12, 1, 4, 7, 8, -5};
        int num = GetMax(arr1);
        System.out.println("Maximum number in array :" + num);
        num = GetMin(arr1);
        System.out.println("Minimum number in array :" + num);

    }

    static void Print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    static void Print(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    // 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1
    public static int[] ChangeArr(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }

    //4. Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое) и
    // с помощью цикла(-ов) заполнить его
    // диагональные элементы единицами;
    public static int[][] TwoDimentionalArr(int[][] arr2D) {

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0, j2 = arr2D[i].length; j < arr2D[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr2D[i][j] = 1;
            }
        }
        return arr2D;
    }


    public static int[] ChangeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] InitializeArray(int length) {
        int[] arr = new int[length];
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
            value += 3;
        }
        return arr;
    }

    public static int GetMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int GetMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static boolean CheckBalance(int[] arr) {
        int leftSideSum = 0;
        for(int i = 0; i < arr.length; i++){
            leftSideSum += arr[i];
            int rightSideSum = 0;
            for (int j = 0; j < arr.length; j++){
                rightSideSum += (j > i)? arr[j] : 0;
            }
            if(leftSideSum == rightSideSum){
                return true;
            }
        }
        return false;
    }
}





