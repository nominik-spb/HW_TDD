import jdk.internal.access.JavaSecurityAccess;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    HashMap<String, String> numberList = new HashMap<>();
    HashMap<String, String> nameList = new HashMap<>();

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

        return null;
    }
}
