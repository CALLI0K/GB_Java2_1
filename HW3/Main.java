package HW3;

import java.util.ArrayList;
import java.util.Arrays;

import static HW3.Second.Testarray1;
import static HW3.Three.Testarray2;


public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(
                "white", "silver", "gray", "black", "maroon", "red",
                "orange", "yellow", "olive", "lime", "green", "aqua", "blue",
                "navy", "teal", "white", "silver", "gray", "silver", "aqua"));

        ArrayList<String> arr2 = Testarray1(arr);
        Testarray2(arr,arr2);

        surname.add("Ivanov Petr","515-534-24-64");
        surname.add("Petrov Ivan","645-425-24-64");
        surname.add("Kuznetsov Ilya","643-241-24-64");

        System.out.println(surname.get("Ivanov Petr"));
    }
   
}
