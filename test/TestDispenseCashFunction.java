
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestDispenseCashFunction {

    CashMachine cashMachine = new CashMachine();

    @ParameterizedTest
    @ValueSource(ints = { 1000, 10002 })
    void testDispenseCash_AmountEnteredByUserIsAvailable(int amountEnteredByUser) {
        cashMachine.dispenseCash(amountEnteredByUser);
        assertEquals(cashMachine.amountDispensedFromTheMachine, amountEnteredByUser);
    }

    @ParameterizedTest
    @ValueSource(ints = { 100001, 100020 })
    void testDispenseCash_AmountEnteredByUserIsUnavailable(int amountEnteredByUser) {
        cashMachine.dispenseCash(amountEnteredByUser);
        assertEquals(cashMachine.amountDispensedFromTheMachine, 2 * amountEnteredByUser);
    }

}
