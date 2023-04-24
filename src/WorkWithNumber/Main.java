package WorkWithNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> editedList = new ArrayList<>();

        for (int value : intList) {
            if (value > 0 & value % 2 == 0) {
                editedList.add(value);
            }
        }
        Collections.sort(editedList);
        for (int value : editedList) {
            System.out.println(value);
        }
    }
}