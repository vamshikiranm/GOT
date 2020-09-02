public class CashMachine {
    int amountOfCashInCashMachine;
    int amountDispensedFromTheMachine;

    CashMachine() {
        this.amountOfCashInCashMachine = 100000;
    }

    void dispenseCash(int amountEnteredByUser) {

        if (amountEnteredByUser > amountOfCashInCashMachine) {
            System.out.println("CashAvailable in machine: " + amountOfCashInCashMachine);
            System.out.println("Entered amount by user: " + amountEnteredByUser);

            amountDispensedFromTheMachine = 2 * amountEnteredByUser;
            dispenseCash(amountDispensedFromTheMachine);

        } else {
            amountDispensedFromTheMachine = amountEnteredByUser;
            this.amountOfCashInCashMachine -= amountDispensedFromTheMachine;
        }
    }

}
