
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestDispenseCashFunction {

    CashMachine cashMachine = new CashMachine();

    @Test
    public void testDispenseCashAmountEnteredByUserIsAvailable() {
        int amountEnteredByUser = 10000;
        cashMachine.dispenseCash(amountEnteredByUser);
        assertEquals(cashMachine.amountDispensedFromTheMachine, amountEnteredByUser);
    }

    @Test
    public void testDispenseCashAmountEnteredByUserIsUnavailable() {
        int amountEnteredByUser = 100001;
        cashMachine.dispenseCash(amountEnteredByUser);
        assertEquals(cashMachine.amountDispensedFromTheMachine, 2 * amountEnteredByUser);
    }

}
