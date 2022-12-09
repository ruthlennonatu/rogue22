import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    @DisplayName("Username Setter Test")
    void testUserSetter() {
        User newUser = new User("Adrian");

        newUser.setUsername("Ciara");
        assertEquals("Ciara", newUser.getUsername(), "Username should now be Ciara");
    }
}