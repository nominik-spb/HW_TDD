import jdk.internal.access.JavaSecurityAccess;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    HashMap<String, String> phoneList = new HashMap<>();

    public int add(String number, String name) {
        phoneList.put(number,name);
        return phoneList.size();
    }

    public String findByNumber(String number) {

        return phoneList.get(number);
    }

    public String findByName(String name) {
        for (Map.Entry<String, String> entry : phoneList.entrySet()) {
            JavaSecurityAccess.ProtectionDomainCache reversedMap = null;
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        return phoneList.containsValue(name);
    }
}
