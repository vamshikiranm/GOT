
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.*;

public class TestUserFingerprintsAuth {

    private AuthenticateFingerprint authenticate;

    @Before
    public void initializeFingerAuthenticationObject() {
        authenticate = new AuthenticateFingerprint();
    }

    @Test
    public void testUserFingerprintInput_CorrectInput() {
        assertTrue(authenticate.authenticateFingerprintInputs("10002"));
    }

    @Test
    public void testUserFingerprintInput_WrongInput() {
        assertFalse(authenticate.authenticateFingerprintInputs("abcd"));
    }
}
