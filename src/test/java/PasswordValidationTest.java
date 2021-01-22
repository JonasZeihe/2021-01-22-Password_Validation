import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTest {

    @Test
    public void PasswordCheckTest(){
        String password ="hallodd";
        int minLength = 5;

        boolean result = PasswordValidationApp.longenough(minLength, password);

        assertEquals(true, result);


    }
}

