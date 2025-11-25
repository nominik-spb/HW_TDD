import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PhoneBookTest {

    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add("Иван Иванов", "8-999-123-45-67");
        assertTrue("Метод add должен возвращать количество номеров", result > 0);
    }
}
