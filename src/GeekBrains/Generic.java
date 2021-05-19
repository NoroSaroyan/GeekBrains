package GeekBrains;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6};
        Generic.changePlace(arr, 0, 4);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index " + i + "-" + arr[i]);
        }
        List<Integer> arrayList = Generic.convertToArrList(arr);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static <TYPE> void changePlace(TYPE[] arr, int index1, int index2) {

        if (index1 >= arr.length || index2 >= arr.length || index2 < 0 || index1 < 0) {
            throw new IndexOutOfBoundsException("Invalid Index");
        }
        TYPE tempValue = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tempValue;
    }

    public static <TYPE> List<TYPE> convertToArrList(TYPE[] arr) {
        ArrayList<TYPE> arrayList = new ArrayList<TYPE>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(i, arr[i]);
        }
        return arrayList;
    }
}
