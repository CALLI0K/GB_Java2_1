package HW3;

import java.util.ArrayList;

public class Second {
    public static void Testarray1(ArrayList<String> arr) {
        ArrayList<String> arr2 = new ArrayList<>();
        for (String test : arr) {
            if (!arr2.contains(test)) {
                arr2.add(test);
            }
        }
        for (String s : arr2) {
            System.out.println(s);
        }
    }
}
