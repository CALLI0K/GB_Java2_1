package HW3;

import java.util.ArrayList;

class Three {
    public static void Testarray2(ArrayList<String> arr, ArrayList<String> arr2) {
        int number;
        for (String test2 : arr2) {
            number = 0;
            for (String test : arr) {
                if (test2.equals(test)) number++;
            }
            System.out.println(test2 + " встречается " + number + " раз(а)");
        }
    }

}