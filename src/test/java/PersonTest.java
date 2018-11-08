import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person person = new Person(null, "name");
        assertEquals("name", person.getName());
    }

    @Test
    void getFriend() {
        Person person = new Person(null, "name");
        Person secondPer = new Person(person, "name");
        assertEquals(null, person.getFriend());
        assertEquals(person, secondPer.getFriend());
    }
}