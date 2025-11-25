import java.util.HashMap;

public class PhoneBook {

    HashMap<String, String> phoneList = new HashMap<>();

    public int add(String number, String name) {
        phoneList.put(number,name);
        return phoneList.size();
    }
}
