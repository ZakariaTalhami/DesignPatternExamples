package ZakariaTalhami.github.state;

import ZakariaTalhami.github.state.atm.ATM;

public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.ejectCard();
        atm.numPadInput();
        atm.insertCard();

        atm.insertCard();
        atm.numPadInput();
        atm.ejectCard();

        atm.numPadInput();
    }
}
