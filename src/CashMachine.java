
public class CashMachine {
    int amountOfCashInCashMachine;
    int amountDispensedFromTheMachine;
    RefillCashMachine jonSnow = new RefillCashMachine();

    CashMachine() {
        this.amountOfCashInCashMachine = 100000;
    }

    void dispenseCash(int amountEnteredByUser) {

        if (amountEnteredByUser > amountOfCashInCashMachine) {

            jonSnow.refillingCashMachine(this);
            amountDispensedFromTheMachine = 2 * amountEnteredByUser;
            dispenseCash(amountDispensedFromTheMachine);

        } else {

            amountDispensedFromTheMachine = amountEnteredByUser;
            this.amountOfCashInCashMachine -= amountDispensedFromTheMachine;

        }
    }

}
