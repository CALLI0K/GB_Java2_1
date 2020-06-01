package HW3;

import java.util.HashMap;
import java.util.Map;

public class surname {
    static Map<String, String> callName = new HashMap<>();

    public static void add(String Name, String Number) {
        callName.put(Name, Number);
    }
    public static String get(String Name) {
        String test=new String();
        test=callName.get(Name);
        return test;
    }
}
