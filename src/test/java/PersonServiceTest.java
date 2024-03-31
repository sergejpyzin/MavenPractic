import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import ru.sergeypyzin.model.Person;
import ru.sergeypyzin.service.PersonFromJSON;
import ru.sergeypyzin.service.PersonToJSON;

public class PersonServiceTest {

    @Test
    public void testCreateFromJSON_Success() {
        String jsonString = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"age\":30}";
        Person expectedPerson = new Person("John", "Doe", 30);

        Person actualPerson = PersonFromJSON.createFromJSON(jsonString);

        assertEquals(expectedPerson, actualPerson);
    }

    @Test
    public void testCreateFromJSON_Failure() {
        String invalidJsonString = "invalidJson";

        Person actualPerson = PersonFromJSON.createFromJSON(invalidJsonString);

        assertNull(actualPerson);
    }

    @Test
    public void testCreateJSONString_Success() {
        Person person = new Person("Jane", "Smith", 25);
        String expectedJsonString = "{\"firstName\":\"Jane\",\"lastName\":\"Smith\",\"age\":25}";

        String actualJsonString = PersonToJSON.createJSONString(person);

        assertEquals(expectedJsonString, actualJsonString);
    }
}
