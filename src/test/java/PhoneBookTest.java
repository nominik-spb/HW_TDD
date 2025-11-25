import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("8-999-123-45-67", "Иван Иванов");
        assertTrue("Метод add должен возвращать количество номеров", result > 0);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String result = phoneBook.findByNumber("8-999-123-45-67");
        assertEquals("Метод add должен возвращать Иванов Иван", result == "Иванов Иван");
    }
}
