
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
    public void testUserFingerprintInputCorrectInput() {
        String fingerprint = "10002";
        boolean result;
        result = authenticate.authenticateFingerprintInputs(fingerprint);
        assertTrue(result);
    }

    @Test
    public void testUserFingerprintInputWrongInput() {
        String fingerprint = "12929";
        boolean result;
        result = authenticate.authenticateFingerprintInputs(fingerprint);
        assertFalse(result);
    }
}
