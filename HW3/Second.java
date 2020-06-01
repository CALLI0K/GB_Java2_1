package HW3;

import java.util.ArrayList;
import java.util.Set;

public class Second {
    public static ArrayList<String> Testarray1(ArrayList<String> arr) {
        ArrayList<String> arr2 = new ArrayList<>();
        for (String test : arr) {
            if (!arr2.contains(test)) {
                arr2.add(test);
            }
        }
        return arr2;
    }
}
