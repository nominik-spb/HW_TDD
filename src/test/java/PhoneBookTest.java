import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("8-999-123-45-67", "Иван Иванов");
        assertTrue("Метод add должен возвращать количество номеров", result > 0);
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("8-999-123-45-00", "Иван Петров");
        phoneBook.add("8-999-123-45-66", "Иван Сидоров");

        String result = phoneBook.findByNumber("8-999-123-45-00");
        assertEquals("Иван Петров", result);
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("8-999-123-45-00", "Иван Петров");
        phoneBook.add("8-999-123-45-66", "Иван Сидоров");

        String result = phoneBook.findByName("Иван Сидоров");
        assertEquals("8-999-123-45-66", result);
    }
}
