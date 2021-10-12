package ZakariaTalhami.github.state.atm.states;

public class IdleATMState implements IATMState {
    @Override
    public boolean insertCard() {
        System.out.println("Card inserted into the ATM.");
        return true;
    }

    @Override
    public boolean numPadInput() {
        System.out.println("Please insert card into the ATM.");
        return false;
    }

    @Override
    public boolean ejectCard() {
        System.out.println("Card does not contain a card at this moment.");
        return false;
    }
}
