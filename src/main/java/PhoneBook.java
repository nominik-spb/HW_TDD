import jdk.internal.access.JavaSecurityAccess;

import java.util.*;

public class PhoneBook {

    HashMap<String, String> numberList = new HashMap<>();
    SortedMap<String, String> nameList = new TreeMap<>();

    public int add(String number, String name) {
        numberList.put(number,name);
        nameList.put(name,number);
        return numberList.size();
    }

    public String findByNumber(String number) {

        return numberList.get(number);
    }

    public String findByName(String name) {

        return nameList.get(name);
    }

    public String printAllNames() {
        if(nameList.isEmpty()) {
            return null;
        }
        else {
            Set<String> keys = nameList.keySet();
            String result = keys.toString();
            System.out.println(result);
            return result;
        }
    }
}
