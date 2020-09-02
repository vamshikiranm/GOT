public class AuthenticateFingerprint {

    private String[] fingerprintsData = { "10001", "10002", "10003" };

    boolean authenticateFingerprintInputs(String fingerprintInputByUser) {
        for (String fingerprint : fingerprintsData) {
            if (fingerprintInputByUser.equals(fingerprint)) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }
}
