package HW3;

import java.util.ArrayList;

class Three {
    public static void Testarray2(ArrayList<String> arr) {
        int number = 0;
        int score = 0;
        for (String test : arr) {
            if (test != "0") {
                number = 0;
                score = 0;
                for (String test2 : arr) {
                    if (test.equals(test2)) {
                        if (number > 0) {
                            arr.set(score, "0");
                        }
                        number++;
                    }
                    score++;


                }
                System.out.println(test + " встречается " + number + " раз(а)");
            }
        }

    }
}